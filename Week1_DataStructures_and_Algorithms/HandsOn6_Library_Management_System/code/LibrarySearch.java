import java.util.Arrays;

public class LibrarySearch {

    public static void linearSearch(Book[] books, String targetTitle) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(targetTitle)) {
                System.out.println("Book found: " + book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }
    }

    public static void binarySearch(Book[] books, String targetTitle) {
        Arrays.sort(books);
        int low = 0;
        int high = books.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int compare = books[mid].getTitle().compareToIgnoreCase(targetTitle);

            if (compare == 0) {
                System.out.println("Book found: " + books[mid]);
                return;
            } else if (compare < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Book not found.");
    }

    public static void viewAllBooks(Book[] books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
