import java.util.Scanner;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentProcessor processor;

        System.out.print("Select Payment Gateway (Paytm / Stripe): ");
        String gateway = scanner.nextLine().trim().toLowerCase();

        if (gateway.equals("paytm")) {
            processor = new PaytmAdapter();
        } else if (gateway.equals("stripe")) {
            processor = new StripeAdapter();
        } else {
            System.out.println("Unsupported payment gateway.");
            scanner.close();
            return;
        }

        System.out.print("Enter amount to pay: ");
        double amount = scanner.nextDouble();

        processor.processPayment(amount);
        scanner.close();
    }
}
