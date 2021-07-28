package com.example.marketmanager.Projects;


import com.example.marketmanager.Projects.Model.Project;
import com.example.marketmanager.Projects.broker.model.TradesmanAffectedToProject;
import com.example.marketmanager.Projects.broker.model.WorkerParticipateToProject;

public interface ProjectService {

    int createProject(Project project);

    void closeProject(int id);

    void affectWorkerToProject(WorkerParticipateToProject workerParticipateToProject);

    void affectTradesmanToProject(TradesmanAffectedToProject tradesmanAffectedToProject);
}
