package com.softee5.daebak.entity;

import jakarta.persistence.*;

@Entity
public class Family {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "car_id", nullable = false)
    private Long carId;

    // Getters
    public Long getId() {
        return id;
    }

    public Long getCarId() {
        return carId;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }
}
