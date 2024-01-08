package com.softee5.daebak.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class CarAccountBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(nullable = false)
    private LocalDate date;

    @Column(name = "expense_type", nullable = false)
    private String expenseType; // 예: "주유비", "세차비", "수리비"

    @Column(nullable = false)
    private Double amount;

    @Column(name = "user_id", nullable = false)
    private String userId;

    // Getters
    public String getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public Double getAmount() {
        return amount;
    }

    public String getUserId() {
        return userId;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
