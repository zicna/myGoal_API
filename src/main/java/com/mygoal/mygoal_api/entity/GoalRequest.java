package com.mygoal.mygoal_api.entity;

import jakarta.validation.constraints.NotBlank;

public class GoalRequest {
    @NotBlank(message = "Goal title can NOT be blank.")
    private String title;
    @NotBlank(message = "Goal start date can NOT be blank.")
    private String startDate;
    @NotBlank(message = "Goal end date can NOT be blank.")
    private String endDate;
    @NotBlank(message = "Goal description can NOT be blank.")
    private String description;
    @NotBlank(message = "Goal status can NOT be blank.")
    private String status;
    @NotBlank(message = "Goal goal type can NOT be blank.")
    private String goalType;

    public GoalRequest() {
    }

    public GoalRequest(String title, String startDate, String endDate, String description, String status,
            String goalType) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.status = status;
        this.goalType = goalType;
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
