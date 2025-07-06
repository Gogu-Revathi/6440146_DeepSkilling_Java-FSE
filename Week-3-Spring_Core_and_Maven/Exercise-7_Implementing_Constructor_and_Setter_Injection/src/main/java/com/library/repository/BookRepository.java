package com.library.repository;

public class BookRepository {
    public void save(String bookTitle) {
        System.out.println("Book '" + bookTitle + "' saved to repository.");
    }
}
