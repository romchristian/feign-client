package com.example.feingclient;

import feign.Response;
import lombok.Data;
import lombok.Getter;


public class RestApiClientException extends Exception {
    private String requestUrl;
    private String message;
    public RestApiClientException(String requestUrl, String message) {
        super(message);
    }
}
