import java.util.Scanner;

class ReverseString {
    public static void main(String args[]) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        s = sc.nextLine();
        System.out.print("reverse string : ");
        for (int k = s.length(); k > 0; --k) {
            System.out.print(s.charAt(k - 1));
        }
        sc.close();
    }
}