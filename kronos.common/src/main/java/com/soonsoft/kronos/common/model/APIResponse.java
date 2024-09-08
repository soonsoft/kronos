package com.soonsoft.kronos.common.model;

public class APIResponse<T> implements IAPIResult<T> {

    private String resultCode;
    private String message;
    private T data;
    private Integer pageIndex;
    private Integer pageSize;
    private Integer pageCount;

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String getResultCode() {
        return this.resultCode;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public T getData() {
        return this.data;
    }

    @Override
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    @Override
    public Integer getPageSize() {
        return this.pageSize;
    }

    @Override
    public Integer getPageCount() {
        return this.pageCount;
    }
    
}
