package fr.esgi.gwto.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

  private static final String TOPIC= "TestMessage";

  @Autowired
  private KafkaTemplate<String, String> kafkaTemplate;

  public void writeMessage(String msg){

    this.kafkaTemplate.send(TOPIC, msg);
  }

}