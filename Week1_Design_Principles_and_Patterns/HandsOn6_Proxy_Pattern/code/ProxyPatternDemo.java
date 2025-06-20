import java.util.Scanner;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter image filename to view (or type 'exit'): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) break;

            Image image = new ProxyImage(input);
            image.display();
        }

        scanner.close();
    }
}
