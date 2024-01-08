package com.softee5.daebak.entity;

import jakarta.persistence.*;

@Entity
public class Communication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "communication_type", nullable = false)
    private String communicationType; // "자랑하기", "쪼르기", "지켜주기"

    @Column(nullable = false)
    private Integer count;

    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column
    private String comment;

    // Getters
    public String getId() {
        return id;
    }

    public String getCommunicationType() {
        return communicationType;
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
    public void setId(String id) {
        this.id = id;
    }

    public void setCommunicationType(String communicationType) {
        this.communicationType = communicationType;
    }

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
