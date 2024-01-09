package com.softee5.daebak.controller;

import com.softee5.daebak.dto.request.CommunicationCreateRequestDto;
import com.softee5.daebak.dto.response.CommunicationCreateResponseDto;
import com.softee5.daebak.service.CommunicationService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    // 서버 측 에러 예외처리
    @ExceptionHandler(Exception.class)
    public ResponseEntity<CommunicationCreateResponseDto> handleException(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new CommunicationCreateResponseDto(false, 500, "서버 측 에러"));
    }

    // 클라이언트 측(잘못된 요청) 에러 예외처리
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<CommunicationCreateResponseDto> handleBadRequestException(BadRequestException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new CommunicationCreateResponseDto(false, 400, "잘못된 요청입니다"));
    }

    // 자원을 찾을 수 없는 경우에 대한 예외처리
    @ExceptionHandler(ChangeSetPersister.NotFoundException.class)
    public ResponseEntity<CommunicationCreateResponseDto> handleNotFoundException(ChangeSetPersister.NotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new CommunicationCreateResponseDto(false, 404, "요청한 자원을 찾을 수 없습니다"));
    }
}

