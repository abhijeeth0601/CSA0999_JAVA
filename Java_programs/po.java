import java.util.Scanner;

public class pos{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int positiveSum = 0, positiveCount = 0;
        int negativeSum = 0, negativeCount = 0;

        System.out.println("Enter numbers (-1 to exit):");

        while (true) {
            number = scanner.nextInt();

            if (number == -1) {
                break;
            } else if (number > 0) {
                positiveSum += number;
                positiveCount++;
            } else if (number < 0) {
                negativeSum += number;
                negativeCount++;
            }
        }

        if (positiveCount > 0) {
            double positiveAverage = (double) positiveSum / positiveCount;
            System.out.println("Average of positive numbers: " + positiveAverage);
        } else {
            System.out.println("No positive numbers were entered.");
        }

        if (negativeCount > 0) {
            double negativeAverage = (double) negativeSum / negativeCount;
            System.out.println("Average of negative numbers: " + negativeAverage);
        } else {
            System.out.println("No negative numbers were entered.");
        }
    }
}