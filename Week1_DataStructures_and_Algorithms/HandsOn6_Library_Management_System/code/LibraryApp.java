import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book[] books = {
            new Book(201, "Introduction to Java", "James Gosling"),
            new Book(202, "Data Structures", "Mark Allen"),
            new Book(203, "Algorithms Unlocked", "Thomas Cormen"),
            new Book(204, "Operating Systems", "Andrew Tanenbaum"),
            new Book(205, "Clean Code", "Robert Martin")
        };

        int choice;
        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. View All Books");
            System.out.println("2. Search by Title (Linear Search)");
            System.out.println("3. Search by Title (Binary Search)");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    LibrarySearch.viewAllBooks(books);
                    break;

                case 2:
                    System.out.print("Enter book title to search (Linear): ");
                    String title1 = scanner.nextLine();
                    LibrarySearch.linearSearch(books, title1);
                    break;

                case 3:
                    System.out.print("Enter book title to search (Binary): ");
                    String title2 = scanner.nextLine();
                    LibrarySearch.binarySearch(books, title2);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
