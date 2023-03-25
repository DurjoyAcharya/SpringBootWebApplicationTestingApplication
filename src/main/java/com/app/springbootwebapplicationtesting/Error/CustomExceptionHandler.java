package com.app.springbootwebapplicationtesting.Error;


import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    public ProblemDetail onRuntimeException(RuntimeException rx)
    {
        var details=
            ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST,rx.getMessage());
        return details;
    }
}
