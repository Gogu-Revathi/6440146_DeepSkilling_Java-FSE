import java.util.Scanner;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computer.Builder builder = new Computer.Builder();

        System.out.print("Enter CPU: ");
        builder.setCpu(scanner.nextLine());

        System.out.print("Enter RAM: ");
        builder.setRam(scanner.nextLine());

        System.out.print("Enter Storage: ");
        builder.setStorage(scanner.nextLine());

        System.out.print("Include GPU? (yes/no): ");
        String gpuChoice = scanner.nextLine();
        if (gpuChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter GPU: ");
            builder.setGpu(scanner.nextLine());
        }

        Computer computer = builder.build();
        computer.displayConfiguration();

        scanner.close();
    }
}
