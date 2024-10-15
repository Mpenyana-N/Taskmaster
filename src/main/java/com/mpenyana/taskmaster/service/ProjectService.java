package com.mpenyana.taskmaster.service;

import com.mpenyana.taskmaster.entity.Project;
import com.mpenyana.taskmaster.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getProjects() {
        return projectRepository.findAll();
    }

    public Optional<Project> getProject(Long id) {
        return projectRepository.findById(id);
    }

    public Project saveProject(Project project) {
      return   projectRepository.save(project);
    }

    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }
}
