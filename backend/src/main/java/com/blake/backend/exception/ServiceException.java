package com.blake.backend.exception;

import com.blake.backend.enums.ErrorType;
import lombok.Getter;

@Getter
public class ServiceException extends RuntimeException{

    private final String errorCode;
    private final String errorMsg;

    public ServiceException(ErrorType errorType) {
        this.errorCode = errorType.getErrorCode();
        this.errorMsg = errorType.getErrorMsg();
    }

    public ServiceException(ErrorType errorType, Throwable cause) {
        super(cause);
        this.errorCode = errorType.getErrorCode();
        this.errorMsg = errorType.getErrorMsg();
    }

    public ServiceException(ErrorType errorType, String customMsg) {
        this.errorCode = errorType.getErrorCode();
        this.errorMsg = customMsg;
    }
}
