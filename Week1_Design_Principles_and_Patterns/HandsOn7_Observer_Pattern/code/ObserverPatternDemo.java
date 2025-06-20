import java.util.Scanner;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StockMarket stockMarket = new StockMarket();

        System.out.print("Register Mobile App? (yes/no): ");
        if (scanner.nextLine().trim().equalsIgnoreCase("yes")) {
            stockMarket.registerObserver(new MobileApp("User"));
        }

        System.out.print("Register Web App? (yes/no): ");
        if (scanner.nextLine().trim().equalsIgnoreCase("yes")) {
            stockMarket.registerObserver(new WebApp("User"));
        }

        while (true) {
            System.out.print("Enter new stock price (or -1 to exit): ");
            double price = scanner.nextDouble();
            if (price == -1) break;
            stockMarket.setPrice(price);
        }

        scanner.close();
    }
}
