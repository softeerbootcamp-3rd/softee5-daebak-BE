package com.softee5.daebak.entity;

import jakarta.persistence.*;

@Entity
public class Family {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String familyId;

    @Column(name = "car_id", nullable = false)
    private String carId;

    // Getters
    public String getId() {
        return familyId;
    }

    public String getCarId() {
        return carId;
    }

    // Setters
    public void setId(String familyId) {
        this.familyId = familyId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }
}
