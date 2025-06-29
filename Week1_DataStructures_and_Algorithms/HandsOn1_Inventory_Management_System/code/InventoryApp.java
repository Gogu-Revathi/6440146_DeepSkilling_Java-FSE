import java.util.Scanner;

public class InventoryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventoryManager manager = new InventoryManager();
        int choice;

        do {
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. View All Products");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Product ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Product Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Quantity: ");
                    int qty = scanner.nextInt();
                    System.out.print("Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    manager.addProduct(new Product(id, name, qty, price));
                    break;

                case 2:
                    System.out.print("Product ID to update: ");
                    String updId = scanner.nextLine();
                    System.out.print("New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("New Quantity: ");
                    int newQty = scanner.nextInt();
                    System.out.print("New Price: ");
                    double newPrice = scanner.nextDouble();
                    scanner.nextLine();
                    manager.updateProduct(updId, newName, newQty, newPrice);
                    break;

                case 3:
                    System.out.print("Product ID to delete: ");
                    String delId = scanner.nextLine();
                    manager.deleteProduct(delId);
                    break;

                case 4:
                    manager.viewAllProducts();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
