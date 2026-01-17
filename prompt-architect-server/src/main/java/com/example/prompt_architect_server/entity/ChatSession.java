package com.example.prompt_architect_server.entity;

import java.time.Instant;

public class ChatSession {
    ChatSessionId chatSessionId;
    Project project;
    User user;
    String title;
    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt; // Soft delete
}
