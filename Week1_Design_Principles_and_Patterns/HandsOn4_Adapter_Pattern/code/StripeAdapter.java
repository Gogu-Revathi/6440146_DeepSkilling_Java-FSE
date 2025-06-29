public class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripe = new StripeGateway();

    @Override
    public void processPayment(double amount) {
        stripe.sendPayment(amount);
    }
}
