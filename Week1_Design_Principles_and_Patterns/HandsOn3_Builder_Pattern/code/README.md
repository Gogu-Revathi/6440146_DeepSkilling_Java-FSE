# Builder Pattern – Interactive Computer Builder

## Scenario
A computer configuration system that allows users to selectively add components such as CPU, RAM, Storage, and GPU using the Builder Pattern.

## Design Pattern Used
Builder Pattern – separates construction of complex objects from their representation, allowing step-by-step creation.

## Project Structure
- `Computer.java`: Product class with nested static Builder class
- `BuilderPatternDemo.java`: Main class for interactive input

## Sample Output
```
Enter CPU: Ryzen 5
Enter RAM: 8GB
Enter Storage: 1TB HDD
Include GPU? (yes/no): no

--- Computer Configuration ---
CPU     : Ryzen 5
RAM     : 8GB
Storage : 1TB HDD
GPU     : None
```

## How to Run
Compile and run:
```
javac *.java
java BuilderPatternDemo
```

## Key Features
- Optional fields (GPU) handled dynamically
- Clearly demonstrates flexibility of Builder Pattern
- Easy to extend for more components
