import java.util.Scanner;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentContext context = new PaymentContext();

        System.out.print("Choose payment method (CreditCard / PayPal): ");
        String method = scanner.nextLine().trim().toLowerCase();

        if (method.equals("creditcard")) {
            context.setStrategy(new CreditCardPayment());
        } else if (method.equals("paypal")) {
            context.setStrategy(new PayPalPayment());
        } else {
            System.out.println("Invalid payment method selected.");
            scanner.close();
            return;
        }

        System.out.print("Enter amount to pay: ");
        double amount = scanner.nextDouble();

        context.executePayment(amount);
        scanner.close();
    }
}
