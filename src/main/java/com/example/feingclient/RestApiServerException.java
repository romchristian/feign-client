package com.example.feingclient;

import feign.Response;
import lombok.Getter;

public class RestApiServerException extends Exception {
    private String requestUrl;
    private String message;
    public RestApiServerException(String requestUrl, String message) {
        super(message);
    }
}
