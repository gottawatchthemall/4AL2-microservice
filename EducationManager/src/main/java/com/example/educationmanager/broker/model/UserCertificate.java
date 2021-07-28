package com.example.educationmanager.broker.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;
import springfox.documentation.spring.web.json.Json;

public class UserCertificate {
  private Long userId;
  private String skillName;

  public UserCertificate(Long userId, String skillName) {
    this.userId = userId;
    this.skillName = skillName;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public String getSkillName() {
    return skillName;
  }

  public void setSkillName(String skillName) {
    this.skillName = skillName;
  }

  @Override
  public String toString() {
    return "UserCertificate{" +
        "userId=" + userId +
        ", skillName='" + skillName + '\'' +
        '}';
  }
}
