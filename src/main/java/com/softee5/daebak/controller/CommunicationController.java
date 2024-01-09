package com.softee5.daebak.controller;

import com.softee5.daebak.dto.request.CommunicationCreateRequestDto;
import com.softee5.daebak.dto.response.CommunicationCreateResponseDto;
import com.softee5.daebak.service.CommunicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/communications")
public class CommunicationController {

    private final CommunicationService communicationService;

    @Autowired
    public CommunicationController(CommunicationService communicationService) {
        this.communicationService = communicationService;
    }

    @PostMapping
    public ResponseEntity<CommunicationCreateResponseDto> createCommunication(@RequestBody CommunicationCreateRequestDto requestDto) {
        communicationService.createCommunication(requestDto);
        CommunicationCreateResponseDto responseDto = new CommunicationCreateResponseDto(true, 200, "소통 생성 성공");
        return ResponseEntity.ok(responseDto);
    }
}

