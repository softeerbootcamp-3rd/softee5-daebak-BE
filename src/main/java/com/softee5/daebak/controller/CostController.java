package com.softee5.daebak.controller;

import com.softee5.daebak.dto.request.CostCreateRequestDto;
import com.softee5.daebak.dto.response.CostCreateResponseDto;
import com.softee5.daebak.service.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/costs")
public class CostController {

    private final CostService costService;

    @Autowired
    public CostController(CostService costService) {
        this.costService = costService;
    }

    @PostMapping
    public ResponseEntity<CostCreateResponseDto> createCost(@RequestBody CostCreateRequestDto requestDto) {
        costService.createCost(requestDto);
        CostCreateResponseDto responseDto = new CostCreateResponseDto(true, 200, "비용 생성 성공");
        return ResponseEntity.ok(responseDto);
    }
}
