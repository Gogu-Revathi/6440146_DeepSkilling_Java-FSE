import java.util.Scanner;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();

        System.out.println("Enter number of log messages:");
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter message " + i + ": ");
            String msg = scanner.nextLine();
            logger.log(msg);
        }

        Logger anotherLogger = Logger.getInstance();
        System.out.println("Are both logger instances the same? " + (logger == anotherLogger));

        scanner.close();
    }
}
