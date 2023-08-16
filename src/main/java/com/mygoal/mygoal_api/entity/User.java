package com.mygoal.mygoal_api.entity;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mygoal.mygoal_api.request.UserRequest;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String email;
    @Column
    private String password;

    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Goal> goals;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User() {
    }

    public User(User source) {
        this.email = source.getEmail();
        this.password = source.getPassword();
    }

    public User(UserRequest userRequest) {
        this.email = userRequest.getEmail();
        this.password = userRequest.getPassword();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGoals(Set<Goal> goals) {
        this.goals = goals;
    }

    public Set<Goal> getGoals() {
        return goals;
    }

}
