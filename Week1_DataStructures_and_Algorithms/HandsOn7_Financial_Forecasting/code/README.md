# Financial Forecasting Using Recursion

## Scenario
Predicts future investment value using recursive logic and annual growth rate.

## Project Structure
- `ForecastCalculator.java`: Recursive and memoized forecasting methods
- `ForecastApp.java`: Interactive user input

## Recursive Forecasting Formula
```
Future Value = Present Value * (1 + Rate)^Years
```

## Time Complexity

| Method          | Time Complexity |
|------------------|------------------|
| Naive Recursion  | O(n)             |
| Memoization      | O(n)             |

## Benefits of Memoization
- Avoids recalculating intermediate values
- Saves stack frames, faster execution

## Sample Output
```
Future Value (Recursive): ₹16105.10
Future Value (Optimized with Memoization): ₹16105.10
```

## How to Run
```
javac *.java
java ForecastApp
```

## Summary
- Demonstrates real-world use of recursion
- Includes optimized memoized version for better performance
