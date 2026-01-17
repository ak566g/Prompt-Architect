package com.example.prompt_architect_server.entity;

import com.example.prompt_architect_server.enums.MessageRole;

import java.time.Instant;

public class ChatMessage {
    Long id;
    ChatSession chatSession;
    MessageRole role;
    String content;
    String toolCalls; // Json array of tools called
    Integer tokensUsed;
    Instant createdAt;
}
