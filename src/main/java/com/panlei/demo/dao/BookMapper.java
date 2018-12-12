package com.panlei.demo.dao;

import com.panlei.demo.bean.Book;
import com.panlei.demo.bean.request.QueryAllBooksReq;
import com.panlei.demo.bean.request.RantReq;

import java.util.List;

public interface BookMapper {
    void addBook(Book book);

    List<Book> queryAllBooks(QueryAllBooksReq req);

    Book selectBookById(Integer book_id);

    void rant(Book book);

    void returnBook(Integer id);

    void edit(Book book);

    void deleteBook(Integer id);
}
