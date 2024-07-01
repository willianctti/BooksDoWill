package com.livrosDoWill.LivrosDoWill.controller;


import com.livrosDoWill.LivrosDoWill.book.Book;
import com.livrosDoWill.LivrosDoWill.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("books")
public class BooksController {

    @Autowired
    private BookRepository repository;
    @GetMapping
    public List<FoodResponseDTO> getAll(){
        List<Book> bookList = repository.findAll();
        return bookList;
    }
}
