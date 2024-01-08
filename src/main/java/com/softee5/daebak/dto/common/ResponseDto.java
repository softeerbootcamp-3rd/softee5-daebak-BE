package com.softee5.daebak.dto.common;

import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ResponseDto {
    private boolean success;
    private int code;
    private String message;
    private LocalDateTime timestamp;

    @Builder
    public ResponseDto(boolean success, int code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    public static ResponseDto of(boolean success, int code, String message) {
        return ResponseDto.builder()
                .success(success)
                .code(code)
                .message(message)
                .build();
    }
}