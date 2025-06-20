# E-commerce Order Sorting

## Scenario
Sort customer orders by total price to prioritize higher-value transactions. Compares Bubble Sort and Quick Sort.

## Project Structure
- `Order.java`: Holds order details
- `OrderSorter.java`: Sorting algorithms
- `OrderSortingApp.java`: CLI with sort selection

## Sorting Algorithm Overview

| Algorithm     | Best      | Average    | Worst     |
|---------------|-----------|------------|-----------|
| Bubble Sort   | O(n)      | O(n²)      | O(n²)     |
| Quick Sort    | O(n log n)| O(n log n) | O(n²)     |

## Sample Output
```
Choose sorting method:
1. Bubble Sort
2. Quick Sort
Enter your choice: 1

--- Sorting with Bubble Sort ---

Sorted Orders by Total Price:
O102 | Srinidhi | ₹799.0
O104 | Kavya    | ₹999.0
O101 | Revathi  | ₹1299.0
O103 | Manasa   | ₹1999.0
```

## How to Run
```
javac *.java
java OrderSortingApp
```

## Takeaway
- Quick Sort is generally preferred for large datasets
- Bubble Sort is simpler but inefficient for performance
