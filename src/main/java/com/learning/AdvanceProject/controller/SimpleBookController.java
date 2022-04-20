package com.learning.AdvanceProject.controller;

import com.learning.AdvanceProject.model.Book;
import com.learning.AdvanceProject.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("books-rest")
public class SimpleBookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/all")
    public @ResponseBody Iterable<Book> getAllUsers() {
        return bookRepository.findAll();
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
}


