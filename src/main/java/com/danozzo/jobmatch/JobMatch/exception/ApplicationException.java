package com.danozzo.jobmatch.JobMatch.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN, reason = "Application not found")
public class ApplicationException extends Exception {

    public ApplicationException(String message) {
        super(message);

    }
}
