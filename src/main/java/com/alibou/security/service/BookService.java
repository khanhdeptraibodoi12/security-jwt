package com.alibou.security.service;

import com.alibou.security.entity.Book;

import java.util.List;

public interface BookService {
    public List<Book> getAllBook();
    public Book newBook(Book book);
}
