package com.example.library.service;

import com.example.library.model.Author;
import com.example.library.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    Optional<Author> save (Author author);
    List<Author> findAll();
}
