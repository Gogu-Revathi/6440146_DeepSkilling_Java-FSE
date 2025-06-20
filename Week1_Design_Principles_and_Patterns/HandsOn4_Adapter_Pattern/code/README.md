# Adapter Pattern – Interactive Payment System

## Scenario
This system integrates multiple third-party payment gateways using the Adapter Pattern. Each gateway has a different interface, and the adapter ensures a consistent way to access them.

## Design Pattern Used
Adapter Pattern – converts different gateway interfaces to a common `PaymentProcessor` interface.

## Project Structure
- `PaymentProcessor.java`: Target interface
- `PaytmGateway.java`, `StripeGateway.java`: Adaptees
- `PaytmAdapter.java`, `StripeAdapter.java`: Adapters
- `AdapterPatternDemo.java`: Interactive test class

## Sample Output
```
Select Payment Gateway (Paytm / Stripe): Stripe
Enter amount to pay: 100
Payment of $100.0 made through Stripe.
```

## How to Run
Compile and run:
```
javac *.java
java AdapterPatternDemo
```

## Key Features
- Easy integration of third-party APIs
- Command-line selection of gateway
- Clean and scalable Adapter Pattern use
