package com.mygoal.mygoal_api.request;

public class UserRequest {
    // ! Can request fields be final
    private final String email;
    private final String password;

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

}
