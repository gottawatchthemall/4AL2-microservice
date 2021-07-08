package com.example.membershipmanager.users;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class User {
    private Long id;
    private String name;
    private String email;
    private String job;
    private Long averageDailyRate;
    private String address;
    private List<Skill> skills;
    private Role role;
}
