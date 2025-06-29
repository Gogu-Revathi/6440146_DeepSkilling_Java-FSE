# Strategy Pattern – Interactive Payment Selector

## Scenario
A payment system allows users to select a payment method (e.g., Credit Card, PayPal) at runtime. Each strategy handles payment in its own way.

## Design Pattern Used
Strategy Pattern – defines a family of algorithms, encapsulates each one, and makes them interchangeable at runtime.

## Project Structure
- `PaymentStrategy.java`: Strategy interface
- `CreditCardPayment.java`, `PayPalPayment.java`: Concrete strategies
- `PaymentContext.java`: Context class that executes the selected strategy
- `StrategyPatternDemo.java`: Interactive CLI test

## Sample Output
```
Choose payment method (CreditCard / PayPal): CreditCard
Enter amount to pay: 999
Paid ₹999.0 using Credit Card.
```

## How to Run
```
javac *.java
java StrategyPatternDemo
```

## Key Features
- Strategy selection at runtime
- Modular and scalable structure
- Clearly demonstrates design pattern usage
