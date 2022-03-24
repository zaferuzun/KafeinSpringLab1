package com.kafein.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BaseErrorAdvice {


    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public BaseError handleException(final IllegalArgumentException exp) {
        return BaseError.newInstance()
                .setMessage(exp.getMessage())
                .setErrorCode(1002);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public BaseError handleException(final MethodArgumentNotValidException exp) {
        BaseError root = BaseError.newInstance()
                .setMessage("validasyon patladı")
                .setErrorCode(200);
        exp.getAllErrors()
                .forEach(e -> root.addSubError(BaseError.newInstance()
                        .setMessage(e.toString())
                        .setErrorCode(1003)));
        return root;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<BaseError> handleException(final Exception exp) {
        if (exp instanceof NullPointerException) {
            ResponseEntity.status(HttpStatus.EXPECTATION_FAILED)
                    .body(BaseError.newInstance()
                            .setMessage(exp.getMessage())
                            .setErrorCode(5001));
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(BaseError.newInstance()
                        .setMessage(exp.getMessage())
                        .setErrorCode(5000));
    }
}
