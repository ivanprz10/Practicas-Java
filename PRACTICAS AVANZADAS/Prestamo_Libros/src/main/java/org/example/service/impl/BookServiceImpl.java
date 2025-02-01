package org.example.service.impl;

import org.example.exception.BookNotFoundException;
import org.example.exception.DuplicateBookException;
import org.example.exception.ErrorMessage;
import org.example.model.Book;
import org.example.service.IBookService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookServiceImpl implements IBookService {

    private final List<Book> books = new ArrayList<>();
    @Override
    public void registerBook(Book book) {
        boolean isDuplicatedIsbn = books.stream()
                .anyMatch(exitingBook ->exitingBook.getIsbn().equals(book.getIsbn()));

        if(isDuplicatedIsbn){
            throw new DuplicateBookException(
                    ErrorMessage.DUPLICATE_BOOK.formatMessage(book.getTitle(),book.getIsbn())
            );

        }
        books.add(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public Optional<Book> findBookByISBN(String isbn) {
        Optional<Book> optionalBook = books.stream()
                .filter(book -> book.getIsbn().equals(isbn))
                .findFirst();

        if (optionalBook.isEmpty()) {

            throw new BookNotFoundException(
                    ErrorMessage.BOOK_NOT_FOUND.formatMessage(isbn)
            );

            
        }        
        return optionalBook;
    }
}
