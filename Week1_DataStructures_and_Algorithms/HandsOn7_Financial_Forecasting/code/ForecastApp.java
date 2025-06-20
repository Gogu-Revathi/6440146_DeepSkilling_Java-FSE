import java.util.Scanner;

public class ForecastApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter current investment amount (₹): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual growth rate (e.g., 0.05 for 5%): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        double futureValue = ForecastCalculator.calculateFutureValue(principal, rate, years);
        System.out.printf("Future Value (Recursive): ₹%.2f\n", futureValue);

        double[] memo = new double[years + 1];
        double futureValueMemo = ForecastCalculator.calculateFutureValueMemo(principal, rate, years, memo);
        System.out.printf("Future Value (Optimized with Memoization): ₹%.2f\n", futureValueMemo);

        scanner.close();
    }
}
