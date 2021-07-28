package com.example.marketmanager.Projects;

import com.example.marketmanager.Projects.Model.Project;
import com.example.marketmanager.Projects.broker.model.TradesmanAffectedToProject;
import com.example.marketmanager.Projects.broker.model.WorkerParticipateToProject;

public interface ProjectRepository {

    int createProject(Project project);

    void closeProjectById(int id);
    void affectWorkerToProject(WorkerParticipateToProject workerParticipateToProject);

    void affectTradesmanToProject(TradesmanAffectedToProject tradesmanAffectedToProject);
}
