package com.example.marketmanager.Projects;

import com.example.marketmanager.Projects.Model.Project;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ProjectFakeRepository implements ProjectRepository {

    List<Project> projects = Collections.emptyList();
    int idIndex = 0;

    @Override
    public int createProject(Project project) {
        project.setId(idIndex);
        idIndex++;
        projects.add(project);
        return project.getId();

    }

    @Override
    public void closeProjectById(int id) {
        if (id > idIndex) {
            throw new RuntimeException("Not found");
        }
        projects.get(id).setOpen(false);
    }

    @Override
    public void affectTradesmanToProject(int projectId, int tradesmanId) {
        if (projectId > idIndex) {
            throw new RuntimeException("Not found");
        }
        projects.get(projectId).setTradesmanAffected(tradesmanId);
    }
}
