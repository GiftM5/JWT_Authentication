package com.example.jwt_auth.controller;

import com.example.jwt_auth.token.JwtProvider;
import com.example.jwt_auth.loggings.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authenticate")
public class AuthControl {
    private final JwtProvider jwtTokenProvider;

    public AuthControl(JwtProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @PostMapping
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
        if ("user".equals(request.getUsername()) && "password".equals(request.getPassword())) {
            String token = jwtTokenProvider.createToken(request.getUsername());

            System.out.println("Generated JWT Token: " + token);

            return ResponseEntity.ok(token);
        } else {
            return ResponseEntity.status(401).body("You have provided an invalid username or password");
        }
    }
}
