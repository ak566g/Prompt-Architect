package com.example.prompt_architect_server.dto.member;

import com.example.prompt_architect_server.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
