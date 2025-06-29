# Observer Pattern – Interactive Stock Market App

## Scenario
Multiple clients (observers) get notified in real-time when stock prices change. This is achieved using the Observer Pattern.

## Design Pattern Used
Observer Pattern – establishes a one-to-many dependency between objects so that when one object changes state, all dependents are notified.

## Project Structure
- `Stock.java`: Subject interface
- `Observer.java`: Observer interface
- `StockMarket.java`: Concrete subject
- `MobileApp.java`, `WebApp.java`: Concrete observers
- `ObserverPatternDemo.java`: Interactive demo

## Sample Output
```
Register Mobile App? (yes/no): yes
Register Web App? (yes/no): yes
Enter new stock price (or -1 to exit): 1500
User Mobile App: Stock price updated to ₹1500.0
User Web App: Stock price updated to ₹1500.0
```

## How to Run
```
javac *.java
java ObserverPatternDemo
```

## Key Features
- Real-time stock price updates
- Dynamically register/unregister observers
- Clean Observer Pattern implementation
