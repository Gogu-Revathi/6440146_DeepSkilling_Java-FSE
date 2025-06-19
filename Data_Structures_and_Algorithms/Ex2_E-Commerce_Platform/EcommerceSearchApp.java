
import java.util.*;
public class EcommerceSearchApp {
    static Scanner scanner = new Scanner(System.in);
    public static int linearSearch(Product[] products, int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == id) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(Product[] products, int id) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (products[mid].productId == id)
                return mid;
            if (products[mid].productId < id)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(105, "Backpack", "Bags"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Watch", "Accessories"),
            new Product(101, "Phone", "Electronics"),
            new Product(104, "Laptop", "Electronics")
        };
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        while (true) {
            System.out.println("\nE-commerce Product Search");
            System.out.println("1. Show All Products");
            System.out.println("2. Linear Search by Product ID");
            System.out.println("3. Binary Search by Product ID");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println(" Product List:");
                for (Product p : products) {
                    System.out.println("  " + p);
                }

            } else if (choice == 2 || choice == 3) {
                System.out.print("Enter Product ID to search: ");
                int id = scanner.nextInt();
                int index = (choice == 2)
                    ? linearSearch(products, id)
                    : binarySearch(products, id);

                if (index != -1) {
                    System.out.println("Found: " + products[index]);
                } else {
                    System.out.println(" Product not found.");
                }

            } else if (choice == 4) {
                System.out.println("Exiting search system.");
                break;

            } else {
                System.out.println(" Invalid choice! Please try again.");
            }
        }
    }
}
