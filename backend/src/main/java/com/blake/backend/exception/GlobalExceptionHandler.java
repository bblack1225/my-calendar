package com.blake.backend.exception;

import com.blake.backend.model.vo.ErrorRes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(value = ServiceException.class)
    public ErrorRes serviceExceptionHandler(ServiceException e) {
        log.error("Error: ", e.getCause());
        return new ErrorRes(e.getErrorCode(), e.getErrorMsg());
    }
}
