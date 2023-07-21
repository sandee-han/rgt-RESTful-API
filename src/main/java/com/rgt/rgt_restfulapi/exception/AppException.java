package com.rgt.rgt_restfulapi.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AppException extends RuntimeException {
    private ErrorCode errorCode;

    public String toString() {
        return String.format("%s, %s", errorCode.toString());
    }
}
