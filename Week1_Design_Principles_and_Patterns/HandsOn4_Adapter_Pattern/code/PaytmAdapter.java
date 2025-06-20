public class PaytmAdapter implements PaymentProcessor {
    private PaytmGateway paytm = new PaytmGateway();

    @Override
    public void processPayment(double amount) {
        paytm.makePayment(amount);
    }
}
