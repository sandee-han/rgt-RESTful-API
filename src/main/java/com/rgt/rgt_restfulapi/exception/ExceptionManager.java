package com.rgt.rgt_restfulapi.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackages = "com.rgt.rgt_restfulapi")
public class ExceptionManager {
    @ExceptionHandler(AppException.class)
    public ResponseEntity<?> OrderExceptionHandler(AppException e) {
        return ResponseEntity.status(e.getErrorCode().getStatus())
                .body("Error");
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<?> runtimeExceptionHandler(AppException e) {
        return ResponseEntity
                .status(e.getErrorCode().getStatus())
                .body("Error");
    }

    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<?> IllegalStateException(AppException e) {
        return ResponseEntity
                .status(e.getErrorCode().getStatus())
                .body("Error");
    }
}
