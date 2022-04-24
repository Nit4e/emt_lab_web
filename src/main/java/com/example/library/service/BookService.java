package com.example.library.service;

import com.example.library.model.Author;
import com.example.library.model.Book;
import com.example.library.model.dto.BookDto;
import com.example.library.model.enumerations.Category;
import com.example.library.model.exceptions.BookNotFoundException;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> findAll();

    Optional<Book> findById(Long id);

    Optional<Book> findByName(String name);

    Optional<Book> save(Book book);

    Optional<Book> save(String name, Category category, Integer availableCopies, Long authorId);

    Optional<Book> edit(Long id, String name, Category category, Integer availableCopies, Long authorId) throws BookNotFoundException;

    void deleteById(Long id);

    Optional<Book> save(BookDto bookDto);

    Optional<Book> edit(Long id, BookDto bookDto);

    Optional<Book> markAsTaken(Long id);
}
