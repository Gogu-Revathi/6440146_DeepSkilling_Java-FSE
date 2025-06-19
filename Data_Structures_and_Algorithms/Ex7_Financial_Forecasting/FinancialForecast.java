
import java.text.DecimalFormat;
import java.util.Scanner;

public class FinancialForecast {

    public static double predictFutureValue(double pv, double rate, int years) {
        if (years == 0) return pv;
        return (1 + rate) * predictFutureValue(pv, rate, years - 1);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Financial Forecasting Tool");

            System.out.print("Enter Present Value (₹): ");
            double pv = scanner.nextDouble();

            System.out.print("Enter Annual Growth Rate (%): ");
            double rate = scanner.nextDouble() / 100;

            System.out.print("Enter Number of Years: ");
            int years = scanner.nextInt();

            System.out.println("Using formula: FV = PV × (1 + r)^n");

            double future = predictFutureValue(pv, rate, years);
            DecimalFormat df = new DecimalFormat("#,##0.00");

            System.out.println(" Future Value after " + years + " years: ₹" + df.format(future));
            System.out.println("Time Complexity: O(n)");
        }
    }
}
