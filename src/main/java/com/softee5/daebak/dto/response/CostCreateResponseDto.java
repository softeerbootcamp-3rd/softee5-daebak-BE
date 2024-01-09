package com.softee5.daebak.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CostCreateResponseDto {
    private boolean success;
    private int code;
    private String message;
}
