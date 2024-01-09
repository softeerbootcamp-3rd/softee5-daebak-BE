package com.softee5.daebak.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;
import java.util.Date;
import java.time.LocalTime;

@Entity
public class Calendar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cal_id")
    private Integer calendarId;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "cal_repeat", nullable = false)
    private String repeatTime;

    @Column(name = "cal_date",nullable = false)
    private Date date;

    @Column(name = "cal_start", nullable = false)
    private LocalTime startTime;

    @Column(name = "cal_end", nullable = false)
    private LocalTime endTime;

    @Column(name = "cal_remind")
    private LocalTime reminderTime;

    // Getters
    public Integer getId() {
        return calendarId;
    }

    public Integer getUserId() {
        return userId;
    }

    public Date getDate() {
        return date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public LocalTime getReminderTime() {
        return reminderTime;
    }

    // Setters
    public void setId(Integer calendarId) {
        this.calendarId = calendarId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public void setReminderTime(LocalTime reminderTime) {
        this.reminderTime = reminderTime;
    }
}
