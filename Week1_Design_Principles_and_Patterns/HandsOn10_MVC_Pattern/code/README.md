# MVC Pattern – Interactive Student Record Viewer

## Scenario
A simple MVC-based application that allows entering and updating a student’s details and displaying them through a View component.

## Design Pattern Used
MVC (Model-View-Controller) Pattern – separates application logic into three interconnected components for modularity.

## Project Structure
- `Student.java`: Model class
- `StudentView.java`: Responsible for displaying student data
- `StudentController.java`: Interacts with model and view
- `MVCPatternDemo.java`: Interactive test application

## Sample Output
```
Enter Student Name: Revathi
Enter Student ID: 22MRECA12
Enter Student Grade: B+

Student Details:
Name  : Revathi
ID    : 22MRECA12
Grade : B+

Do you want to update the grade? (yes/no): yes
Enter new grade: A+

Updated Student Info:
Student Details:
Name  : Revathi
ID    : 22MRECA12
Grade : A+
```

## How to Run
```
javac *.java
java MVCPatternDemo
```

## Key Features
- Follows MVC structure cleanly
- Real-time input and update of model data
- Clear separation of concern between logic, UI, and data
