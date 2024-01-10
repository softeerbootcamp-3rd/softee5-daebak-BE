package com.softee5.daebak.exception;

import com.softee5.daebak.dto.common.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {BusinessException.class})
    public ResponseEntity<ResponseDto> handleCustomException(BusinessException e) {
        log.error("Status: {}, Message: {}", e.getResponseDto().getCode(), e.getMessage());

        // 여기서 e.getResponseDto()를 직접 사용합니다.
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(e.getResponseDto());
    }
}
