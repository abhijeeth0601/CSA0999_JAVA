import java.util.*;

class ReverseNumber {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String input;
        int rem, rev = 0;
        System.out.print("Enter a number: ");
        input = s.nextLine();
        if (input.matches("\\d+")) {
            int num = Integer.parseInt(input);
            while (num > 0) {
                rem = num % 10;
                rev = (rev * 10) + rem;
                num = num / 10;
            }
            System.out.println("Reverse Number is : " + rev);
        } else {
            System.out.println("Please enter a valid number.");
        }

        s.close();
    }
}
