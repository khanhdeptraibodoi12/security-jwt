package com.alibou.security.service.impl;

import com.alibou.security.Repository.BookRepository;
import com.alibou.security.entity.Book;
import com.alibou.security.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;
    @Override
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public Book newBook(Book book) {
        return bookRepository.save(book);
    }
}
