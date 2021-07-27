package com.example.educationmanager.security.account;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Account {
    private String username;
    private String password;
    private List<String> roles;
}
