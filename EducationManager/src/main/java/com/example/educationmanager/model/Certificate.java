package com.example.educationmanager.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Certificate {
    private Long id;
    private String name;
}
