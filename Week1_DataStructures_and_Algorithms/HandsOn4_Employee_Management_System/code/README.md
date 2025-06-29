# Employee Management System (Array-Based)

## Scenario
This application uses an array to store and manage employee records with options to add, search, delete, and view employees.

## Project Structure
- `Employee.java`: Employee model
- `EmployeeManager.java`: Business logic using array
- `EmployeeApp.java`: Interactive CLI

## Array Operations & Complexity

| Operation | Description         | Time Complexity |
|-----------|---------------------|------------------|
| Add       | Add at next index   | O(1)             |
| Search    | Linear search by ID | O(n)             |
| Traverse  | Print all records   | O(n)             |
| Delete    | Shift elements      | O(n)             |

## Sample Output
```
1. Add Employee
2. View All Employees
3. Search Employee by ID
4. Delete Employee
0. Exit
```

## Limitations
- Fixed size (set to 100 here)
- Insert/Delete requires shifting if large data

## How to Run
```
javac *.java
java EmployeeApp
```

## When to Use Arrays
- Simple, predictable data size
- Fast random access by index
