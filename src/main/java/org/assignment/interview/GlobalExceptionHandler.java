package org.assignment.interview;

import org.assignment.interview.emails.providers.NotFoundProviderException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({NotFoundProviderException.class})
    public ResponseEntity<Response> handleNotFoundProviderException(NotFoundProviderException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Response(false, exception.getMessage()));
    }

}
