package com.panlei.demo.bean.request;

public class BaseReqPage {
    private static final Integer num=1;
    private static final Integer size=10;

    private Integer pageNum = 1;
    private Integer pageSize = 10;

    public BaseReqPage() {
        this.pageNum = num;
        this.pageSize = size;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
