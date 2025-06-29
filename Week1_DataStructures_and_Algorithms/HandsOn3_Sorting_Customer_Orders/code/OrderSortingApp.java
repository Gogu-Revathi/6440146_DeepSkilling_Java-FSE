import java.util.Scanner;

public class OrderSortingApp {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O101", "Revathi", 1299.0),
            new Order("O102", "Srinidhi", 799.0),
            new Order("O103", "Manasa", 1999.0),
            new Order("O104", "Kavya", 999.0)
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose sorting method:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("\n--- Sorting with Bubble Sort ---");
            OrderSorter.bubbleSort(orders);
        } else if (choice == 2) {
            System.out.println("\n--- Sorting with Quick Sort ---");
            OrderSorter.quickSort(orders, 0, orders.length - 1);
        } else {
            System.out.println("Invalid choice. Exiting.");
            scanner.close();
            return;
        }

        System.out.println("\nSorted Orders by Total Price:");
        OrderSorter.displayOrders(orders);
        scanner.close();
    }
}
