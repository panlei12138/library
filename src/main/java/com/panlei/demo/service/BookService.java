package com.panlei.demo.service;

import com.panlei.demo.bean.Book;
import com.panlei.demo.bean.request.QueryAllBooksReq;
import com.panlei.demo.bean.request.RantReq;
import com.panlei.demo.bean.response.BaseRes;

public interface BookService {
    BaseRes addBook(Book book);

    BaseRes queryAllBooks(QueryAllBooksReq queryAllBooksReq);

    BaseRes queryBookById(Integer id);

    BaseRes rantBook(Book book);

    BaseRes editBook(Book book);

    BaseRes returnBook(Integer id);

    BaseRes deleteBook(Integer id);
}
