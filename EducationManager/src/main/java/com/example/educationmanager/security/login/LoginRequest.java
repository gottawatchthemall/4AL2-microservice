package com.example.educationmanager.security.login;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}
