package com.example.prompt_architect_server.dto.auth;

public record LoginRequest(
        String email,
        String password
) {
}
