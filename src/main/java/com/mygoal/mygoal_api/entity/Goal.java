package com.mygoal.mygoal_api.entity;

import com.mygoal.mygoal_api.request.GoalRequest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private String startDate;
    @Column
    private String endDate;
    @Column
    private String description;
    @Column
    private String status;
    @Column
    private String goalType;

    // ? Should we have this??
    // private boolean accomplished;
    public Goal() {
    }

    public Goal(String title, String startDate, String endDate, String description, String status, String goalType) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.status = status;
        this.goalType = goalType;
    }

    public Goal(GoalRequest goalRequest) {
        this.title = goalRequest.getTitle();
        this.title = goalRequest.getStartDate();
        this.title = goalRequest.getEndDate();
        this.title = goalRequest.getDescription();
        this.title = goalRequest.getStatus();
        this.title = goalRequest.getGoalType();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGoalType() {
        return this.goalType;
    }

    public void setGoalType(String goalType) {
        this.goalType = goalType;
    }

}
