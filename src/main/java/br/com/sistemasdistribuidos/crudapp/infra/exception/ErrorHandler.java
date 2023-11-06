package br.com.sistemasdistribuidos.crudapp.infra.exception;

import jakarta.persistence.EntityNotFoundException;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.stream.Collectors;

@RestControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity handleNotFoundError() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Resource not found");
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity handleBadRequestError(MethodArgumentNotValidException ex) {
        var errors = ex.getFieldErrors();
        var errorMessages = errors.stream()
                .map(ValidationErrorData::new)
                .collect(Collectors.toList());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessages);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity handleBadRequestError(HttpMessageNotReadableException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid request body: " + ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity handleInternalServerError(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal server error: " + ex.getLocalizedMessage());
    }

    @Getter
    private static class ValidationErrorData {
        private final String field;
        private final String message;

        public ValidationErrorData(FieldError error) {
            this.field = error.getField();
            this.message = error.getDefaultMessage();
        }

    }
}
