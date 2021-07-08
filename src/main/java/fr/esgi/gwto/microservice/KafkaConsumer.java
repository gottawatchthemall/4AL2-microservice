package fr.esgi.gwto.microservice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

  @KafkaListener(topics="TestMessage", groupId="message")
  public void getMessage(String message){
    System.out.println(message);
  }
}