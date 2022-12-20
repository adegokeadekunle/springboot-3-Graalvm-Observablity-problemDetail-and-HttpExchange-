package com.adekunle.springboot3newfeatures.exception;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.URI;

@RestControllerAdvice
public class ControllerAdviser {

    @ExceptionHandler(CustomerNotFoundException.class)
    public ProblemDetail errorHandler(CustomerNotFoundException ex){

        var probDetail =ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(400),ex.getMessage());
        probDetail.setType(URI.create("https://errordetails.com"));
        probDetail.setTitle("invalid input");
        return probDetail;
    }
}
