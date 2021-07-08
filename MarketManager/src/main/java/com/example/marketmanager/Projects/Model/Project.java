package com.example.marketmanager.Projects.Model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Project {
    int id;
    String name;
    String description;
    double price;
    boolean open;
    int userId;
    int tradesmanAffected;
    List<Skill> skills;

}
