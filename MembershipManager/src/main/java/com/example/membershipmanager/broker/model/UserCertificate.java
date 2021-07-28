package com.example.membershipmanager.broker.model;

import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serializer;

import java.io.Serializable;
import java.util.Map;

public class UserCertificate {
  private Long userId;
  private String skillName;

  public UserCertificate(Long userId, String skillName) {
    this.userId = userId;
    this.skillName = skillName;
  }
  public UserCertificate() {

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
