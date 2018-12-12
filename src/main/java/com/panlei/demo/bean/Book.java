package com.panlei.demo.bean;

import java.util.Date;

public class Book {

    private Integer id;

    private String book_name;

    private String author;

    private Integer status;

    private Date rant_date1;

    private Date rant_date2;

    private String ranter;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getRant_date1() {
        return rant_date1;
    }

    public void setRant_date1(Date rant_date1) {
        this.rant_date1 = rant_date1;
    }

    public Date getRant_date2() {
        return rant_date2;
    }

    public void setRant_date2(Date rant_date2) {
        this.rant_date2 = rant_date2;
    }

    public String getRanter() {
        return ranter;
    }

    public void setRanter(String ranter) {
        this.ranter = ranter;
    }
}
