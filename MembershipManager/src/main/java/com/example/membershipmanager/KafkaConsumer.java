package com.example.membershipmanager;

import com.example.membershipmanager.broker.model.UserCertificate;
import com.example.membershipmanager.users.User;
import com.example.membershipmanager.users.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class KafkaConsumer {
  private final UserService userService;

  @KafkaListener(topics="saveUserCertificate", groupId="EducationManager")
  public void saveUserCertificate(String jsonResponse) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();

    UserCertificate userCertificate = objectMapper.readValue(jsonResponse, objectMapper.getTypeFactory().constructType(UserCertificate.class));

    this.userService.setUserSkill(userCertificate);
  }
}