package com.softee5.daebak.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;

@Entity
public class Cost {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")

    private String carAccountBookId;

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
        return carAccountBookId;
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
    public void setId(String carAccountBookId) {
        this.carAccountBookId = carAccountBookId;
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
