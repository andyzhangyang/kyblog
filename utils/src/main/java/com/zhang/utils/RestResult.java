package com.zhang.utils;

import lombok.Data;

@Data
public class RestResult<T> {
    private boolean success = true;
    private String errorCode;
    private String errorMessage;
    private T data;

}
