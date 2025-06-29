# E-commerce Platform – Product Search

## Scenario
This Java app simulates a product search function using two algorithms:
- **Linear Search**: Simple but slower for large datasets.
- **Binary Search**: Faster, but needs sorted data.

## Project Structure
- `Product.java`: Model class with search fields
- `ProductSearch.java`: Implements linear and binary search
- `EcommerceSearchApp.java`: Interactive input and demo

## Time Complexity Comparison

| Algorithm     | Best | Average | Worst |
|---------------|------|---------|--------|
| Linear Search | O(1) | O(n)    | O(n)   |
| Binary Search | O(1) | O(log n)| O(log n) |

## Sample Output
```
Enter product name to search: Mouse

1. Linear Search:
Found: P102 | Mouse | Electronics

2. Binary Search:
Found: P102 | Mouse | Electronics
```

## How to Run
```
javac *.java
java EcommerceSearchApp
```

## Takeaway
- Linear search is fine for small or unsorted data.
- Binary search is best for large, sorted datasets.
