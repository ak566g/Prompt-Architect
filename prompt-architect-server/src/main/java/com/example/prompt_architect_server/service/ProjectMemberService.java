package com.example.prompt_architect_server.service;

import com.example.prompt_architect_server.dto.member.InviteMemberRequest;
import com.example.prompt_architect_server.dto.member.MemberResponse;
import com.example.prompt_architect_server.dto.member.UpdateMemberRoleRequest;
import com.example.prompt_architect_server.entity.ProjectMember;

import java.util.List;

public interface ProjectMemberService {
    List<ProjectMember> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
}
