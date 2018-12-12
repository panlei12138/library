package com.panlei.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.panlei.demo.bean.Book;
import com.panlei.demo.bean.request.QueryAllBooksReq;
import com.panlei.demo.bean.request.RantReq;
import com.panlei.demo.bean.response.BaseRes;
import com.panlei.demo.dao.BookMapper;
import com.panlei.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("BookService")
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;

    @Override
    public BaseRes addBook(Book book) {
        bookMapper.addBook(book);
        return new BaseRes();
    }

    @Override
    public BaseRes queryAllBooks(QueryAllBooksReq req) {
        PageHelper.startPage(req.getPageNum(), req.getPageSize());
        List<Book> books = bookMapper.queryAllBooks(req);
        PageInfo<Book> pageInfo = new PageInfo<>(books);
        return new BaseRes(pageInfo);
    }

    @Override
    public BaseRes queryBookById(Integer id) {
        Book book = bookMapper.selectBookById(id);
        return new BaseRes(book);
    }

    @Override
    public BaseRes rantBook(Book req) {
        Book book = bookMapper.selectBookById(req.getId());
        if(book.getStatus() == 2) {
            return new BaseRes(0, "该书已借出");
        } else {
            bookMapper.rant(req);
        }
        return new BaseRes();
    }

    @Override
    public BaseRes editBook(Book book) {
        bookMapper.edit(book);
        return new BaseRes();
    }

    @Override
    public BaseRes deleteBook(Integer id) {
        bookMapper.deleteBook(id);
        return new BaseRes();
    }

    @Override
    public BaseRes returnBook(Integer id) {
        bookMapper.returnBook(id);
        return new BaseRes();
    }
}
