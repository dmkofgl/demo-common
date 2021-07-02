package com.example.common.api.model.token;

import lombok.Data;

@Data
public class TokenRequest {
    private String email;
    private String password;
}
