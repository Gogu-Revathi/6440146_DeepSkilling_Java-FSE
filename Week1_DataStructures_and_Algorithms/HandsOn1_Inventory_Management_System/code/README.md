# Inventory Management System

## Scenario
A warehouse inventory app where users can add, update, delete, and view product records. Uses `HashMap` for efficient access and operations.

## Data Structures & Algorithms
- **HashMap<String, Product>** is used to store products for O(1) average case operations.
- Operations implemented:
  - Add product
  - Update product
  - Delete product
  - View all products

## Time Complexity
| Operation | Time Complexity |
|-----------|------------------|
| Add       | O(1)             |
| Update    | O(1)             |
| Delete    | O(1)             |
| View All  | O(n)             |

## Sample Output
```
--- Inventory Menu ---
1. Add Product
2. Update Product
3. Delete Product
4. View All Products
0. Exit
Enter your choice: 1
Product ID: P001
Product Name: Keyboard
Quantity: 10
Price: 599
Product added successfully.
```

## How to Run
```
javac *.java
java InventoryApp
```

## Benefits
- Fast lookup using HashMap
- Fully interactive CLI
- Easy to extend with more features
