# Library Management System (Search)

## Scenario
This system allows users to search books by title using both linear and binary search algorithms.

## Project Structure
- `Book.java`: Book model
- `LibrarySearch.java`: Linear and Binary search methods
- `LibraryApp.java`: Command-line interface

## Search Algorithms & Time Complexity

| Algorithm     | Sorted Required | Best Case | Worst Case |
|---------------|-----------------|-----------|------------|
| Linear Search | No              | O(1)      | O(n)       |
| Binary Search | Yes             | O(1)      | O(log n)   |

## Sample Output
```
1. View All Books
2. Search by Title (Linear Search)
3. Search by Title (Binary Search)
0. Exit
```

## How to Run
```
javac *.java
java LibraryApp
```

## Summary
- Linear Search is simple but slower for large data
- Binary Search is efficient but requires sorted data
