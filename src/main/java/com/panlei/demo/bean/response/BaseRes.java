package com.panlei.demo.bean.response;

import com.github.pagehelper.PageInfo;
import com.panlei.demo.bean.Book;

public class BaseRes {
    private Integer code = 1;

    private String msg;

    private Object data;

    public BaseRes() {}

    public BaseRes(Integer i) {
        this.code = i;
    }

    public BaseRes(int i, String msg) {
        this.code = i;
        this.msg = msg;
    }

    public BaseRes(PageInfo<Book> pageInfo) {
        this.data = pageInfo;
    }

    public BaseRes(Book book) {
        this.data = book;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
