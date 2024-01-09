package com.softee5.daebak.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommunicationCreateRequestDto {
    private String communicationType;
    private String actionType;
    private String comment;
    private String userId;

    // Lombok이 자동으로 Getters와 Setters를 생성합니다.
}

