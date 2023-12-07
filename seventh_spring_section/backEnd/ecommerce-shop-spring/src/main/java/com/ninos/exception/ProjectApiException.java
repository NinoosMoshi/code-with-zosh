package com.ninos.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class ProjectApiException  extends RuntimeException{

    private HttpStatus status;
    private String message;

}
