package com.softee5.daebak.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Communication {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String communicationId;

    @Column(name = "communication_type", nullable = false)
    private String communicationType; // "자랑하기", "쪼르기", "지켜주기"

    @Column(name = "action_type", nullable = false)
    private String actionType; // "주유", "세차", "수리"

    @Column(nullable = false)
    private Integer count;

    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column
    private String comment;

    // Getters
    public String getId() {
        return communicationId;
    }

    public String getCommunicationType() {
        return communicationType;
    }

    public String getActionType() {
        return actionType;
    }

    public Integer getCount() {
        return count;
    }

    public String getUserId() {
        return userId;
    }

    public String getComment() {
        return comment;
    }

    // Setters
    public void setId(String communicationId) {
        this.communicationId = communicationId;
    }

    public void setCommunicationType(String communicationType) {this.communicationType = communicationType;}

    public void setActionType(String actionType) {this.actionType = actionType;}

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
