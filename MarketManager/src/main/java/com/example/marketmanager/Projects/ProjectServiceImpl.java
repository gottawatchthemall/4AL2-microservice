package com.example.marketmanager.Projects;

import com.example.marketmanager.Projects.Model.Project;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    public final ProjectRepository projectRepository;

    @Override
    public int createProject(Project project) {
        return projectRepository.createProject(project);

    }

    @Override
    public void closeProject(int id) {
        projectRepository.closeProjectById(id);
    }

    @Override
    public void affectTradesmanToProject(int projectId, int tradesmanId) {
        projectRepository.affectTradesmanToProject(projectId, tradesmanId);
    }
}
