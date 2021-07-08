package com.example.membershipmanager.users;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Skill {
    private Long id;
    private String name;
}
