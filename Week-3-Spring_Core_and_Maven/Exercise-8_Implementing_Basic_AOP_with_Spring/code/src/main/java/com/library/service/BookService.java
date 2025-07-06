package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void publishBook(String title) {
        System.out.println("Publishing book: " + title);
        bookRepository.store(title);
    }
}
