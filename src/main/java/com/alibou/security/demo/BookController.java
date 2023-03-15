package com.alibou.security.demo;

import com.alibou.security.entity.Book;
import com.alibou.security.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    @Autowired
    BookService bookService;

    //get all book
    @GetMapping
    @ResponseStatus(HttpStatus.OK
    )
    public List<Book> getAllBook(){
       return bookService.getAllBook();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book newBook(@RequestBody Book book){
        return bookService.newBook(book);
    }

}
