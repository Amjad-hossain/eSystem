package com.codehaven.exception;

/**
 * Created by amjad on 7/3/15.
 */
public class ApiException extends Exception{

    private int code;

    public ApiException (int code, String msg) {
        super(msg);
        this.code = code;
    }
}
