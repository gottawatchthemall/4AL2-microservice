package com.example.marketmanager.Projects.Model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Project {
    Long id;
    String name;
    String description;
    double price;
    boolean open;
    Long userId;
    List<Long> workersId;
    Long tradesmanAffected;
    List<Skill> skills;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Long> getWorkersId() {
        return workersId;
    }

    public void setWorkersId(List<Long> workersId) {
        this.workersId = workersId;
    }

    public Long getTradesmanAffected() {
        return tradesmanAffected;
    }

    public void setTradesmanAffected(Long tradesmanAffected) {
        this.tradesmanAffected = tradesmanAffected;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
