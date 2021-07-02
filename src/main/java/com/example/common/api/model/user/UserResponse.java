package com.example.common.api.model.user;


import lombok.Data;

@Data
public class UserResponse {
    private Long id;
    private String username;
    private String email;
}
