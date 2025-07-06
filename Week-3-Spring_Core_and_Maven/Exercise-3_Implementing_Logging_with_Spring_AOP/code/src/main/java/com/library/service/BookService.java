package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookName) {
        System.out.println("Adding book: " + bookName);
        simulateProcessing();
        bookRepository.saveBook(bookName);
    }

    private void simulateProcessing() {
        try {
            Thread.sleep(500); // Simulate 500ms delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
