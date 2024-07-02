package com.ltp.contacts;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ltp.contacts.exceptions.ErrorResponse;
import com.ltp.contacts.exceptions.NoContactFoundException;

@ControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(NoContactFoundException.class)
    public ResponseEntity<Object> NoContactFoundExceptionHandler(NoContactFoundException ex) {

        ErrorResponse errorResponse = new ErrorResponse(ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.OK);
    }

}
