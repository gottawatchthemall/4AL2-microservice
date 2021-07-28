package com.example.marketmanager.Projects;

import com.example.marketmanager.Projects.Model.Project;
import com.example.marketmanager.Projects.broker.model.TradesmanAffectedToProject;
import com.example.marketmanager.Projects.broker.model.WorkerParticipateToProject;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ProjectFakeRepository implements ProjectRepository {

    List<Project> projects = Collections.emptyList();
    Long idIndex = 0L;

    @Override
    public int createProject(Project project) {
        project.setId(idIndex);
        idIndex++;
        projects.add(project);
        return project.getId().intValue();
    }

    @Override
    public void closeProjectById(int id) {
        if (id > idIndex) {
            throw new RuntimeException("Not found");
        }
        projects.get(id).setOpen(false);
    }

    @Override
    public void affectWorkerToProject(WorkerParticipateToProject workerParticipateToProject) {

        if (workerParticipateToProject.getProjectId() > idIndex) {
            throw new RuntimeException("Not found");
        }

        projects
            .get(workerParticipateToProject.getProjectId().intValue())
            .getWorkersId().add(workerParticipateToProject.getUserId());
    }

    @Override
    public void affectTradesmanToProject(TradesmanAffectedToProject tradesmanAffectedToProject) {
        if (tradesmanAffectedToProject.getProjectId() > idIndex) {
            throw new RuntimeException("Not found");
        }

        projects
            .get(tradesmanAffectedToProject.getProjectId().intValue())
            .setTradesmanAffected(tradesmanAffectedToProject.getUserId());
    }
}
