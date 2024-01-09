package com.softee5.daebak.service;

import com.softee5.daebak.dto.request.CommunicationCreateRequestDto;
import com.softee5.daebak.entity.Communication;
import com.softee5.daebak.repository.CommunicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommunicationService {

    private final CommunicationRepository communicationRepository;

    @Autowired
    public CommunicationService(CommunicationRepository communicationRepository) {
        this.communicationRepository = communicationRepository;
    }

    public Communication createCommunication(CommunicationCreateRequestDto requestDto) {
        Communication communication = new Communication();
        communication.setCommunicationType(requestDto.getCommunicationType());
        communication.setActionType(requestDto.getActionType());
        communication.setComment(requestDto.getComment());
        communication.setUserId(requestDto.getUserId());
        // 추가할거있음 여기에

        return communicationRepository.save(communication);
    }
}