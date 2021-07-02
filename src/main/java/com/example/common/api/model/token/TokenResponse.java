package com.example.common.api.model.token;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TokenResponse {
    private String token;
    private Long userId;
    private Date issuedAt;
    private Date expired;
    private TokenRole role;

}
