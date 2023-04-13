package com.blake.backend.enums;

import lombok.Getter;

@Getter
public enum ErrorType {
    CALENDAR_NOT_FOUND("1001", "Calendar not found");

    private final String errorCode;
    private final String errorMsg;
    ErrorType(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
}
