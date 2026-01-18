package com.example.prompt_architect_server.dto.project;

import java.time.Instant;

public record FileNode(
        String path,
        Instant modifiedAt,
        Long size,
        String type
) {
}
