package com.adrar.cdah2.controller;

import com.adrar.cdah2.exception.LivreNotFoundException;
import com.adrar.cdah2.exception.NoLivreFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class LivreExceptionController {

    @ExceptionHandler(LivreNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String livreNotFound(LivreNotFoundException livreNotFound) {
        return livreNotFound.getMessage();
    }

    @ExceptionHandler(NoLivreFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String noLivres(NoLivreFoundException noLivreFound) {
        return noLivreFound.getMessage();
    }

}
