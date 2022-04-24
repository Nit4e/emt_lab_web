package com.example.library.config;

import com.example.library.model.Author;
import com.example.library.model.Book;
import com.example.library.model.Country;
import com.example.library.model.enumerations.Category;
import com.example.library.service.AuthorService;
import com.example.library.service.BookService;
import com.example.library.service.CountryService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class DataInitializer {

    private final CountryService countryService;
    private final AuthorService authorService;
    private final BookService bookService;

    public DataInitializer(CountryService countryService, AuthorService authorService, BookService bookService) {
        this.countryService = countryService;
        this.authorService = authorService;
        this.bookService = bookService;
    }

    @PostConstruct
    public void init() {

        this.countryService.save(new Country("Macedonia", "Europe"));
        this.countryService.save(new Country("South Korea", "Asia"));
        this.countryService.save(new Country("Italy", "Europe"));

        List<Country> countries = this.countryService.findAll();

        this.authorService.save(new Author("Risto", "Krle", countries.get(0)));
        this.authorService.save(new Author("Kim", "Siwon", countries.get(1)));
        this.authorService.save(new Author("Dante", "Aligieri", countries.get(2)));

        List<Author> authors = this.authorService.findAll();

        this.bookService.save(new Book("Parite se otepuvachka", Category.DRAMA, 10, authors.get(0)));
        this.bookService.save(new Book("Scarlet Heart Ryeo", Category.HISTORY, 10, authors.get(1)));
        this.bookService.save(new Book("Pekolot", Category.DRAMA, 10, authors.get(2)));
    }
}
