package com.mr.courses.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
public class Course {

    @Id
    private String code;
    private String name;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private long participantsLimit;
    private long participantsNumber;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public long getParticipantsLimit() {
        return participantsLimit;
    }

    public void setParticipantsLimit(long participantsLimit) {
        this.participantsLimit = participantsLimit;
    }

    public long getParticipantsNumber() {
        return participantsNumber;
    }

    public void setParticipantsNumber(long participantsNumber) {
        this.participantsNumber = participantsNumber;
    }
}
