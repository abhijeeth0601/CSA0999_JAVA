import java.util.*;

class PascalTriangle {
    public static int fact(int num) {
        int f = 1, i = 1;
        while (i <= num) {
            f = f * i;
            i++;
        }
        return f;
    }

    public static void main(String[] args) {
        int line;
        int i, j;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of lines : ");
        line = s.nextInt();
        for (i = 0; i < line; i++) {
            for (j = 0; j < line - i - 1; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(" " + fact(i) / (fact(j) * fact(i - j)));
            }
            System.out.println("");
        }
        s.close();
    }
}
