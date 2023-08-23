package com.workintech.lombok.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class AnimalException extends RuntimeException{
    private HttpStatus status;

    public AnimalException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
