package com.adrar.cdah2.controller;

import com.adrar.cdah2.exception.LivreNotFoundException;
import com.adrar.cdah2.exception.NoLivreFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class LivreExceptionController {

    @ExceptionHandler(LivreNotFoundException.class)
    public ResponseEntity<Map<String, String>> livreNotFound(LivreNotFoundException livreNotFound) {
        Map <String, String> errorResponse = new HashMap<>();
        errorResponse.put("Erreur", livreNotFound.getMessage());
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(errorResponse);
    }

    @ExceptionHandler(NoLivreFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String noLivres(NoLivreFoundException noLivreFound) {
        return noLivreFound.getMessage();
    }

}
