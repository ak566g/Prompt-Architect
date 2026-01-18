package com.example.prompt_architect_server.dto.auth;

public record SignupRequest(
        String email,
        String name,
        String password
) {
}
