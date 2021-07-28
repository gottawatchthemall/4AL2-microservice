package com.example.marketmanager;

import com.example.marketmanager.Projects.ProjectService;
import com.example.marketmanager.Projects.broker.model.TradesmanAffectedToProject;
import com.example.marketmanager.Projects.broker.model.WorkerParticipateToProject;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class KafkaConsumer {
  private final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);
  private final ProjectService projectService;

  @KafkaListener(topics="WorkerParticipateToProject", groupId = "MembershipManager")
  public void WorkerParticipateToProject(WorkerParticipateToProject workerParticipateToProject){
    logger.info(String.format("Market manager WorkerParticipateToProject called:", workerParticipateToProject.toString()));
    this.projectService.affectWorkerToProject(workerParticipateToProject);
  }

  @KafkaListener(topics="tradesmanAffectedToProject", groupId = "MembershipManager")
  public void tradesmanAffectedToProject(TradesmanAffectedToProject tradesmanAffectedToProject){
    logger.info(String.format("Market manager tradesmanAffectedToProject called:", tradesmanAffectedToProject.toString()));
    this.projectService.affectTradesmanToProject(tradesmanAffectedToProject);
  }
}
