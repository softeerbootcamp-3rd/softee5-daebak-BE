package com.softee5.daebak.dto.request;

import java.time.LocalDate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CostCreateRequestDto {
    private String expenseType;
    private Double amount;
    private LocalDate date;
    private Integer userId;
}
