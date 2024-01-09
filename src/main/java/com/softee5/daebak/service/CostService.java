package com.softee5.daebak.service;

import com.softee5.daebak.dto.request.CostCreateRequestDto;
import com.softee5.daebak.entity.Cost;
import com.softee5.daebak.repository.CostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CostService {

    private final CostRepository costRepository;

    @Autowired
    public CostService(CostRepository costRepository) {
        this.costRepository = costRepository;
    }

    public void createCost(CostCreateRequestDto requestDto) {
        Cost cost = new Cost();
        cost.setExpenseType(requestDto.getExpenseType());
        cost.setAmount(requestDto.getAmount());
        cost.setDate(requestDto.getDate());
        cost.setUserId(requestDto.getUserId());

        costRepository.save(cost);
    }
}
