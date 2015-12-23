package com.evatlsong.archetype.exception;

import org.springframework.http.HttpStatus;

/**
 * Created by evatlsong on 15-12-23.
 */
public class RestException extends RuntimeException {

    public HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

    public RestException() {
    }

    public RestException(HttpStatus status) {
        this.status = status;
    }

    public RestException(String message) {
        super(message);
    }

    public RestException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }
}