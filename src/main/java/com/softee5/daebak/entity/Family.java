package com.softee5.daebak.entity;

import jakarta.persistence.*;

@Entity
public class Family {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "car_id", nullable = false)
    private String carId;

    // Getters
    public String getId() {
        return id;
    }

    public String getCarId() {
        return carId;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }
}
