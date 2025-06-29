# Singleton Pattern

This project demonstrates the Singleton Pattern through a logging system. Only one instance of the logger is created, regardless of how many times it's accessed.

## How It Works
- The user enters multiple log messages.
- All logs are printed through the same singleton logger instance.

## Project Structure
- `Logger.java`: Singleton class with logging method
- `SingletonPatternDemo.java`: Main class with interactive input using Scanner

## How to Run
```
javac *.java
java SingletonPatternDemo
```

## Sample Output
```
Enter number of log messages:
2
Enter message 1: User login
[AppLogger]: User login
Enter message 2: User logout
[AppLogger]: User logout
Are both logger instances the same? true
```

## Key Concepts
- Singleton Pattern ensures one instance globally
- Useful for logging, configuration, caching systems
