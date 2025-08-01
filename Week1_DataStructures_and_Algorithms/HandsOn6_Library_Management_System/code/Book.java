public class Book implements Comparable<Book> {
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public int getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public String toString() {
        return bookId + " | " + title + " | " + author;
    }

    public int compareTo(Book other) {
        return this.title.compareToIgnoreCase(other.title);
    }
}
