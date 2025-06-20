public class EmployeeManager {
    private Employee[] employees;
    private int count;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    public void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count++] = emp;
            System.out.println("Employee added.");
        } else {
            System.out.println("Employee array full.");
        }
    }

    public void viewAllEmployees() {
        if (count == 0) {
            System.out.println("No employee records.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public void searchEmployee(int empId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == empId) {
                System.out.println("Found: " + employees[i]);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void deleteEmployee(int empId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == empId) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}
