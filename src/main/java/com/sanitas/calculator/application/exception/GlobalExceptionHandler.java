package com.sanitas.calculator.application.exception;

import com.sanitas.calculator.domain.entity.RestErrorEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/** GlobalExceptionHandler */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<RestErrorEntity> handleMissingServletRequestParameterException(MissingServletRequestParameterException ex) {

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                RestErrorEntity.builder()
                        .status(HttpStatus.BAD_REQUEST.value())
                        .description(ex.getMessage())
                        .build());
    }


}
