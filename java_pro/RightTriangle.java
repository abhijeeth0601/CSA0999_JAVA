import java.util.*;

class RightTriangle {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.print("Enter the no of rows : ");
        num = s.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        s.close();
    }
}
