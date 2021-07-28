package com.example.educationmanager;

import com.example.educationmanager.broker.model.UserCertificate;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
  private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);
  private static final String saveUserCertificate = "saveUserCertificate";

  @Autowired
  private KafkaTemplate<String, Object> kafkaTemplate;

  public void saveUserCertificate(UserCertificate userCertificate) throws JsonProcessingException {
    logger.info(String.format("#### -> Producing message -> %s", userCertificate.getUserId(), userCertificate.getSkillName()));

    ObjectMapper objectMapper = new ObjectMapper();
    var json = objectMapper.writeValueAsString(userCertificate);
    this.kafkaTemplate.send(saveUserCertificate, json);
  }
}