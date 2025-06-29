# Decorator Pattern – Interactive Notification System

## Scenario
This system sends messages through multiple optional channels like Email, SMS, and Slack. The Decorator Pattern allows adding channels dynamically at runtime.

## Design Pattern Used
Decorator Pattern – adds responsibilities to an object dynamically without modifying its structure.

## Project Structure
- `Notifier.java`: Interface
- `EmailNotifier.java`: Base notifier
- `NotifierDecorator.java`: Abstract decorator
- `SMSNotifierDecorator.java`, `SlackNotifierDecorator.java`: Concrete decorators
- `DecoratorPatternDemo.java`: Interactive CLI demo

## Sample Output
```
Add SMS notification? (yes/no): yes
Add Slack notification? (yes/no): yes
Enter your message: Server maintenance
Sending Email: Server maintenance
Sending SMS: Server maintenance
Sending Slack message: Server maintenance
```

## How to Run
```
javac *.java
java DecoratorPatternDemo
```

## Key Features
- Dynamic notification options
- No class explosion
- Easily extendable with new channels
