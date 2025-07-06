package com.library.repository;

public class BookRepository {
    public void store(String bookTitle) {
        System.out.println("Repository: '" + bookTitle + "' saved.");
    }
}
