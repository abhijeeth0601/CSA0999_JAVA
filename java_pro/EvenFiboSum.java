import java.util.Scanner;

class EvenFiboSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of 'n': ");
        int n = scanner.nextInt();

        int sum = sumEvenFibonacci(n);
        System.out.println("\nSum of even Fibonacci numbers till " + n + ": " + sum);

        scanner.close();
    }

    public static int sumEvenFibonacci(int n) {
        int a = 0, b = 1, c = 0, sum = 0;
        System.out.print("0 1 ");
        while (c <= n) {
            c = a + b;
            a = b;
            b = c;

            if (c % 2 == 0 && c <= n) {
                sum += c;
            }
            System.out.print(c + " ");
        }
        return sum;
    }
}
