package me.dio.controller.execption;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler
    public ResponseEntity<String> handleBusinessEcxeption(IllegalArgumentException businessEcxeption){
        return new ResponseEntity<>(businessEcxeption.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler
    public ResponseEntity<String> handleNotFoundEcxeption(NoSuchElementException notFoundEcxeption){
        return new ResponseEntity<>("ID não encontrado", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<String> handleUnexpectedException(Throwable unexpectedException){
        var menssage ="Erro inesperado, verifcar log";
        logger.error(menssage);
        return new ResponseEntity<>(menssage,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
