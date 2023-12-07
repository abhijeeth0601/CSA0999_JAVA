import java.util.*;

class LcmGcd {
    public static void main(String args[]) {
        int n1, n2, lcm = 0, gcd = 0, i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number 1 : ");
        n1 = s.nextInt();
        System.out.println("Enter the number 2 : ");
        n2 = s.nextInt();
        for (i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        lcm = (n1 * n2) / gcd;
        System.out.println("LCM is: " + lcm);
        System.out.print("GCD is: " + gcd);
        s.close();
    }
}