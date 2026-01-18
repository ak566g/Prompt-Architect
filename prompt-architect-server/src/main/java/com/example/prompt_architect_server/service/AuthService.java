package com.example.prompt_architect_server.service;

import com.example.prompt_architect_server.dto.auth.AuthResponse;
import com.example.prompt_architect_server.dto.auth.LoginRequest;
import com.example.prompt_architect_server.dto.auth.SignupRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
