package com.example.marketmanager.Projects;

import com.example.marketmanager.Projects.Model.Project;

public interface ProjectRepository {

    int createProject(Project project);

    void closeProjectById(int id);

    void affectTradesmanToProject(int projectId, int tradesmanId);
}
