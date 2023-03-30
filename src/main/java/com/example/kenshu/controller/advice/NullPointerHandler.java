package com.example.kenshu.controller.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class NullPointerHandler {
    static final private String ERROR_MESSAGE = "数値を入力してください。";
    @ExceptionHandler(NullPointerException.class)
    public String nullException(NullPointerException e) {
        return ERROR_MESSAGE;
    }
}

