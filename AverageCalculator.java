import java.util.Scanner;

public class AverageCalculator {
    public static double computeAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number:");
        double num1 = scanner.nextDouble();

        System.out.print("Input the second number:");
        double num2 = scanner.nextDouble();

        System.out.print("Input the third number:");
        double num3 = scanner.nextDouble();

        double average = computeAverage(num1, num2, num3);
        System.out.println("The average value is" + average);

        scanner.close();
    }
}