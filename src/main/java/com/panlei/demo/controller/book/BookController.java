package com.panlei.demo.controller.book;

import com.panlei.demo.bean.Book;
import com.panlei.demo.bean.request.QueryAllBooksReq;
import com.panlei.demo.bean.request.RantReq;
import com.panlei.demo.bean.response.BaseRes;
import com.panlei.demo.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/book")
public class BookController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BookController.class);

    @Autowired
    BookService bookService;

    @RequestMapping("/addBook")
    public BaseRes addBook(@RequestBody Book book) {
        LOGGER.info("[BookController] execute addBook!");
        return bookService.addBook(book);
    }

    @RequestMapping("/deleteBook")
    public BaseRes deleteBook(@RequestBody Book book) {
        LOGGER.info("[BookController] execute deleteBook!");
        return bookService.deleteBook(book.getId());
    }

    @RequestMapping("/editBook")
    public BaseRes editBook(@RequestBody Book Book) {
        LOGGER.info("[BookController] execute editBook!");
        return bookService.editBook(Book);
    }

    @RequestMapping("/queryAllBooks")
    public BaseRes queryAllBooks(@RequestBody QueryAllBooksReq queryAllBooksReq) {
        LOGGER.info("[BookController] execute queryAllBooks!");
        return bookService.queryAllBooks(queryAllBooksReq);
    }

    @RequestMapping("/queryBookById")
    public BaseRes queryBookById(@RequestBody Book book) {
        LOGGER.info("[BookController] execute queryBookById!");
        return bookService.queryBookById(book.getId());
    }

    @RequestMapping("/rantBook")
    public BaseRes rantBook(@RequestBody Book book) {
        LOGGER.info("[BookController] execute rant!");
        return bookService.rantBook(book);
    }

    @RequestMapping("/returnBook")
    public BaseRes returnBook(@RequestBody Book book) {
        LOGGER.info("[BookController] execute returnBook!");
        return bookService.returnBook(book.getId());
    }

    public static void main(String[] args) {
        System.out.println(new Date());
    }
}
