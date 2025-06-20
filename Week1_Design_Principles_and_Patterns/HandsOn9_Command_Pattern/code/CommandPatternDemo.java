import java.util.Scanner;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Light light = new Light();
        RemoteControl remote = new RemoteControl();

        System.out.print("Enter command (on/off): ");
        String input = scanner.nextLine().trim().toLowerCase();

        if (input.equals("on")) {
            remote.setCommand(new LightOnCommand(light));
        } else if (input.equals("off")) {
            remote.setCommand(new LightOffCommand(light));
        } else {
            System.out.println("Invalid command.");
            scanner.close();
            return;
        }

        remote.pressButton();
        scanner.close();
    }
}
