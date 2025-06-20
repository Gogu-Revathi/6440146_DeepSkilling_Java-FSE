import java.util.Scanner;
public class FactoryDemo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            DocumentFactory factory;
            Document document;

            while (true) {
                System.out.println("\n Document Creator");
                System.out.println("1. Create Word Document");
                System.out.println("2. Create PDF Document");
                System.out.println("3. Create Excel Document");
                System.out.println("4. Exit");
                System.out.print("Choose: ");
                
                if (!scanner.hasNextInt()) {
                    System.out.println("Please enter a valid number.");
                    scanner.next(); 
                    continue;
                }

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        factory = new WordDocumentFactory();
                        break;
                    case 2:
                        factory = new PdfDocumentFactory();
                        break;
                    case 3:
                        factory = new ExcelDocumentFactory();
                        break;
                    case 4:
                        System.out.println(" Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice.");
                        continue;
                }

                document = factory.createDocument();
                document.open();
            }
        }
    }
}
