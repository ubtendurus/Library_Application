package com.example.Library_Application.controller;


import com.example.Library_Application.entity.Book;
import com.example.Library_Application.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public String findAllBooks(Model model){
        List<Book> books = bookService.findAllBooks();
        model.addAttribute("books", books);
        return "books";
    }

    @GetMapping("/book/{id}")
    public String findBookById(Model model, @PathVariable Long id){
        Book book = bookService.findBookById(id);
        model.addAttribute("book", book);
        return "list-book";
    }
}
