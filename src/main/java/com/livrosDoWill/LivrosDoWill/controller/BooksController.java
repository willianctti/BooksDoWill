package com.livrosDoWill.LivrosDoWill.controller;


import com.livrosDoWill.LivrosDoWill.book.Book;
import com.livrosDoWill.LivrosDoWill.book.BookRepository;
import com.livrosDoWill.LivrosDoWill.book.BookRequestDTO;
import com.livrosDoWill.LivrosDoWill.book.BookResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
public class BooksController {

    @Autowired
    private BookRepository repository;
    @GetMapping
    public List<BookResponseDTO> getAll(){
        List<BookResponseDTO> bookList =  repository.findAll().stream().map(BookResponseDTO::new).toList();
        return bookList;
    }

    @PostMapping
    public void saveBook(@RequestBody BookRequestDTO data) {
        Book bookData = new Book(data);
        repository.save(bookData);
        return;
    }
}
