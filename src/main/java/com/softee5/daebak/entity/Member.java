package com.softee5.daebak.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    Long id;
}
