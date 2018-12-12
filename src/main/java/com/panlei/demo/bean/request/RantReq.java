package com.panlei.demo.bean.request;

import java.util.Date;

public class RantReq {
    private String user_name;

    private Integer book_id;

    private Date rant_date1;

    private Date rant_date2;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
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
}
