package com.example.prompt_architect_server.service;

import com.example.prompt_architect_server.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
