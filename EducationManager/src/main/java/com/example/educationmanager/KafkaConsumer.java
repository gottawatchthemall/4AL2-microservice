package com.example.educationmanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
  private final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

  @KafkaListener(topics="TestMessage", groupId = "message")
  public void getMessage(String message){
    logger.info(String.format("#### -> Consumed message -> %s", message));
  }
}
