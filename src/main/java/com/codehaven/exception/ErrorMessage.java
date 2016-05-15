package com.codehaven.exception;

import org.springframework.beans.BeanUtils;

/**
 * Created by amjad on 8/6/15.
 */
public class ErrorMessage {

    private int code;

    private int httpStatusCode;

    private String message;

    private String helpLink;

    public ErrorMessage(BadRequestException badRequestException) {
        BeanUtils.copyProperties(badRequestException, this);
    }

    public ErrorMessage(int code, int httpStatusCode, String message, String helpLink) {
        this.code = code;
        this.httpStatusCode = httpStatusCode;
        this.message = message;
        this.helpLink = helpLink;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHelpLink() {
        return helpLink;
    }

    public void setHelpLink(String helpLink) {
        this.helpLink = helpLink;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
