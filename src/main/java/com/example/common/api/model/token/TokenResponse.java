package com.example.common.api.model.token;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
public class TokenResponse {
    private String token;
    private Long userId;
    private Date iat;
    private Date exp;
    private TokenRole role;

}
