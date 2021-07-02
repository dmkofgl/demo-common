package com.example.common.api.contract;

import com.example.common.api.model.token.TokenRequest;
import com.example.common.api.model.token.TokenResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("auth")
public interface AuthApi {

    @PostMapping("/token")
    ResponseEntity<TokenResponse> generateToken(@RequestBody TokenRequest tokenRequest);

    @GetMapping("/token/{token}")
    ResponseEntity<TokenResponse> getToken(@PathVariable("token") String tokenRequest);

    @GetMapping("/token/validate/{token}")
    Boolean validateAuthToken(@PathVariable("token") String tokenValue);
}
