# Task Management System (Singly Linked List)

## Scenario
This program manages tasks dynamically using a singly linked list.

## Project Structure
- `Task.java`: Model class
- `TaskNode.java`: Linked list node
- `TaskList.java`: List operations (add, search, delete, view)
- `TaskApp.java`: Interactive user input

## Linked List Operations & Complexity

| Operation | Description         | Time Complexity |
|-----------|---------------------|------------------|
| Add       | Append at end       | O(n)             |
| Search    | Search by task ID   | O(n)             |
| Traverse  | View all tasks      | O(n)             |
| Delete    | Remove by ID        | O(n)             |

## Sample Output
```
1. Add Task
2. View All Tasks
3. Search Task by ID
4. Delete Task
0. Exit
```

## Advantages over Arrays
- No fixed size limit
- Insert/delete without shifting

## How to Run
```
javac *.java
java TaskApp
```
