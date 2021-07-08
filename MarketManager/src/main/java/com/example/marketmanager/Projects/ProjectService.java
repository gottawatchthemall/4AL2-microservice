package com.example.marketmanager.Projects;


import com.example.marketmanager.Projects.Model.Project;

public interface ProjectService {

    int createProject(Project project);

    void closeProject(int id);

    void affectTradesmanToProject(int projectId, int tradesmanId);
}
