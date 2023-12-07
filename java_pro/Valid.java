import java.util.*;

class Valid {
    public static void main(String[] args) {
        String s, str;
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        s = sc.nextLine();
        System.out.print("reenter the string : ");
        str = sc.nextLine();
        if (s.equals(str)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        sc.close();
    }
}
