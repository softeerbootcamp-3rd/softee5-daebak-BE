package com.softee5.daebak.exception;

import com.softee5.daebak.dto.common.ResponseDto;

public class BusinessException extends RuntimeException {
    private final ResponseDto responseDto;

    public BusinessException(int code, String message) {
        super(message);
        this.responseDto = ResponseDto.of(false, code, message);
    }

    public BusinessException(int code, String message, Throwable cause) {
        super(message, cause);
        this.responseDto = ResponseDto.of(false, code, message);
    }

    public ResponseDto getResponseDto() {
        return responseDto;
    }
}