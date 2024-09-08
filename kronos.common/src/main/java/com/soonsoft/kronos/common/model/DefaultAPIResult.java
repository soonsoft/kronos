package com.soonsoft.kronos.common.model;

import java.util.LinkedHashMap;

public class DefaultAPIResult extends LinkedHashMap<String, Object> implements IAPIResult<Object> {

    private final static String RESULT_CODE = "resultCode";
    private final static String MESSAGE = "message";
    private final static String DATA = "data";
    private final static String PAGE_INDEX = "pageIndex";
    private final static String PAGE_SIZE = "pageSize";
    private final static String PAGE_COUNT = "pageCount";

    protected DefaultAPIResult() {
        // capacity = propertyCount / 0.75 + 1;
        super(9);
    }

    @Override
    public String getResultCode() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getResultCode'");
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMessage'");
    }

    @Override
    public Object getData() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getData'");
    }

    @Override
    public Integer getPageIndex() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPageIndex'");
    }

    @Override
    public Integer getPageSize() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPageSize'");
    }

    @Override
    public Integer getPageCount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPageCount'");
    }
    
}
