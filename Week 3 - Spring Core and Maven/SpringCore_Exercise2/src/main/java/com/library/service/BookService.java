package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter for Dependency Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void display() {
        System.out.println("BookService: Handling book operations");

        // Use BookRepository
        if (bookRepository != null) {
            bookRepository.display();
        } else {
            System.out.println("BookRepository is not injected!");
        }
    }
}
