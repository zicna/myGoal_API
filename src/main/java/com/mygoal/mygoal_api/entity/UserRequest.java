package com.mygoal.mygoal_api.entity;

import jakarta.validation.constraints.*;

public class UserRequest {
    // ! Can request fields be final
    @Email(message = "email must be valid")
    @NotBlank(message = "email must be valid")
    private String email;
    @Min(4)
    private String password;

    public UserRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
