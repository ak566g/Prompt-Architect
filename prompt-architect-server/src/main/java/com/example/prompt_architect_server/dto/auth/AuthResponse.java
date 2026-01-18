package com.example.prompt_architect_server.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user
) {

}
