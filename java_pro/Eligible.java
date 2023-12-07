import java.util.*;

class Eligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter the persons age : ");
        age = sc.nextInt();
        if (age > 0) {
            if (age > 18) {
                System.out.println("The person is eligible of voting");
            } else {
                System.out.println(
                        "The person is not eligble for voting and that person need " + (18 - age)
                                + " to become eligble");
            }
        } else {
            System.out.println("Invalid input, please enter a positive number.");
        }
        sc.close();
    }
}
