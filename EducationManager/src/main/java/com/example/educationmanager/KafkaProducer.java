package com.example.educationmanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
  private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);
  private static final String TOPIC= "TestMessage";

  @Autowired
  private KafkaTemplate<String, String> kafkaTemplate;

  public void writeMessage(String msg){
    logger.info(kafkaTemplate.toString());
    // kafkaTemplate.getClass().
    logger.info(String.format("#### -> Producing message -> %s", msg));
    this.kafkaTemplate.send(TOPIC, msg);
  }
}