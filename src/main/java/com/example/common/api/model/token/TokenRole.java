package com.example.common.api.model.token;

public enum TokenRole {
    SERVICE, USER;

    public String role() {
        return "ROLE_" + this.name();
    }
}
