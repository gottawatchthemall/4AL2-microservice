package com.example.marketmanager.Projects;


import com.example.marketmanager.Projects.Model.Project;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
@RequestMapping("/api/projects")
public class ProjectController {

    public final ProjectService projectService;


    @PostMapping("")
    public int createProject(@RequestBody Project project) {
        return projectService.createProject(project);
    }

    @DeleteMapping("/{id}")
    public void closeProject(@PathVariable int id) {
        projectService.closeProject(id);
        //TODO FREE tradesman
    }
}
