import java.util.Scanner;

public class EcommerceSearchApp {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P101", "Keyboard", "Electronics"),
            new Product("P102", "Mouse", "Electronics"),
            new Product("P103", "T-Shirt", "Apparel"),
            new Product("P104", "Shoes", "Footwear"),
            new Product("P105", "Smartphone", "Electronics")
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name to search: ");
        String keyword = scanner.nextLine();

        System.out.println("\n1. Linear Search:");
        Product linearResult = ProductSearch.linearSearch(products, keyword);
        if (linearResult != null)
            System.out.println("Found: " + linearResult);
        else
            System.out.println("Product not found.");

        System.out.println("\n2. Binary Search:");
        Product binaryResult = ProductSearch.binarySearch(products, keyword);
        if (binaryResult != null)
            System.out.println("Found: " + binaryResult);
        else
            System.out.println("Product not found.");

        scanner.close();
    }
}
