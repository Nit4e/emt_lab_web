package com.example.library.model.dto;

import com.example.library.model.enumerations.Category;
import lombok.Data;

@Data
public class BookDto {

    private String name;

    private Category category;

    private Integer availableCopies;

    private Long author;

    public BookDto() {
    }

    public BookDto(String name, Category category, Integer availableCopies, Long author) {
        this.name = name;
        this.category = category;
        this.availableCopies = availableCopies;
        this.author = author;
    }
}
