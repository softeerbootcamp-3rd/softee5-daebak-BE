package com.softee5.daebak.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

@Entity
public class Cost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cost_id")
    private Integer costId;

    @Column(name = "cost_date", nullable = false)
    private Date date;

    @Column(name = "cost_type", nullable = false)
    private String expenseType; // 예: "주유비", "세차비", "수리비"

    @Column(name = "cost_total",nullable = false)
    private Double amount;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    // Getters
    public Integer getId() {
        return costId;
    }

    public Date getDate() {
        return date;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public Double getAmount() {
        return amount;
    }

    public Integer getUserId() {
        return userId;
    }

    // Setters
    public void setId(Integer costId) {
        this.costId = costId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}