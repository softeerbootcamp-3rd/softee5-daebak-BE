package com.softee5.daebak.dto.request;

import java.time.LocalDate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CommunicationCreateRequestDto {
    private String communicationType;
    private String actionType;
    private String comment;
    private Integer userId;
}

