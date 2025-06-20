import java.util.Scanner;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select document type to create (Word / PDF / Excel): ");
        String type = scanner.nextLine().trim().toLowerCase();

        DocumentFactory factory = null;

        switch (type) {
            case "word":
                factory = new WordFactory();
                break;
            case "pdf":
                factory = new PdfFactory();
                break;
            case "excel":
                factory = new ExcelFactory();
                break;
            default:
                System.out.println("Invalid document type selected.");
                scanner.close();
                return;
        }

        Document doc = factory.createDocument();
        doc.open();

        scanner.close();
    }
}
