package com.example.prompt_architect_server.service;

import com.example.prompt_architect_server.dto.project.FileContentResponse;
import com.example.prompt_architect_server.dto.project.FileNode;

import java.util.List;

public interface FileService {
    List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
