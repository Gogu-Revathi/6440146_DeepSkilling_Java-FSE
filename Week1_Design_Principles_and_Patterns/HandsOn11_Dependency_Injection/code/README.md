# Dependency Injection – Interactive Customer Management App

## Scenario
The service class in this app depends on a repository to fetch customer data. We use constructor-based Dependency Injection to inject the repository dependency into the service.

## Design Principle Used
**Dependency Injection** – promotes loose coupling and testability by injecting dependencies at runtime.

## Project Structure
- `Customer.java`: Model class representing a customer
- `CustomerRepository.java`: Interface for data access
- `CustomerRepositoryImpl.java`: Implements data access logic
- `CustomerService.java`: Business logic that depends on repository
- `DependencyInjectionDemo.java`: Interactive test to simulate customer search

## Sample Output
```
Enter Customer ID to search: 103
Customer ID   : 103
Customer Name : Manasa
```

## How to Run
```
javac *.java
java DependencyInjectionDemo
```

## Key Features
- Constructor-based dependency injection
- Easily replaceable repository implementation
- Interactive customer lookup experience
