package com.workintech.lombok.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnimalErrorResponse {
    private int status;
    private String message;
    private long timestamp;
}
