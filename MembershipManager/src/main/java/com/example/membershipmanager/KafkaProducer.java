package com.example.membershipmanager;

import com.example.membershipmanager.broker.model.TradesmanAffectedToProject;
import com.example.membershipmanager.broker.model.WorkerParticipateToProject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
  private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);
  private static final String TOPIC_WORKER_PARTICIPATE_TO_PROJECT = "WorkerParticipateToProject";
  private static final String TOPIC_TRADESMAN_AFFECTED_TO_PROJECT = "WorkerParticipateToProject";
  @Autowired
  private KafkaTemplate<String, Object> kafkaTemplate;

  public void WorkerParticipateToProject(WorkerParticipateToProject workerParticipateToProject){
    logger.info(String.format("#### -> Producing workerParticipateToProject -> %s", workerParticipateToProject.toString()));
    this.kafkaTemplate.send(TOPIC_WORKER_PARTICIPATE_TO_PROJECT, workerParticipateToProject);
  }

  public void TradesmanAffectedToProject(TradesmanAffectedToProject tradesmanAffectedToProject){
    logger.info(String.format("#### -> Producing tradesmanAffectedToProject -> %s", tradesmanAffectedToProject.toString()));
    this.kafkaTemplate.send(TOPIC_TRADESMAN_AFFECTED_TO_PROJECT, tradesmanAffectedToProject);
  }
}