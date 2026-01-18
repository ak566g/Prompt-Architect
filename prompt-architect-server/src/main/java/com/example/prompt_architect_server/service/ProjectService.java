package com.example.prompt_architect_server.service;

import com.example.prompt_architect_server.dto.project.ProjectRequest;
import com.example.prompt_architect_server.dto.project.ProjectResponse;
import com.example.prompt_architect_server.dto.project.ProjectSummaryResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects(Long userId);

    ProjectResponse getProjectById(Long userId, Long id);

    ProjectResponse createProject(ProjectRequest request, Long userId);

    ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);
}
