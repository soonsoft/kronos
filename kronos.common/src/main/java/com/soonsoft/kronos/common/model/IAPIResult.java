package com.soonsoft.kronos.common.model;

public interface IAPIResult<T> {

    String getResultCode();

    String getMessage();

    T getData();

    Integer getPageIndex();

    Integer getPageSize();

    Integer getPageCount();
    
}
