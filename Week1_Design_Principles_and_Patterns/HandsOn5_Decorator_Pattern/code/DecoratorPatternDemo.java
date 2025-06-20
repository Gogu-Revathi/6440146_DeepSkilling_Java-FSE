import java.util.Scanner;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Notifier notifier = new EmailNotifier();

        System.out.print("Add SMS notification? (yes/no): ");
        String sms = scanner.nextLine().trim().toLowerCase();
        if (sms.equals("yes")) {
            notifier = new SMSNotifierDecorator(notifier);
        }

        System.out.print("Add Slack notification? (yes/no): ");
        String slack = scanner.nextLine().trim().toLowerCase();
        if (slack.equals("yes")) {
            notifier = new SlackNotifierDecorator(notifier);
        }

        System.out.print("Enter your message: ");
        String message = scanner.nextLine();

        notifier.send(message);
        scanner.close();
    }
}
