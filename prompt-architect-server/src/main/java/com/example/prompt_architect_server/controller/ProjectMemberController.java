package com.example.prompt_architect_server.controller;


import com.example.prompt_architect_server.dto.member.InviteMemberRequest;
import com.example.prompt_architect_server.dto.member.MemberResponse;
import com.example.prompt_architect_server.dto.member.UpdateMemberRoleRequest;
import com.example.prompt_architect_server.entity.ProjectMember;
import com.example.prompt_architect_server.service.ProjectMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects/{projectId/members")
public class ProjectMemberController {
    private final ProjectMemberService projectMemberService;


    @GetMapping
    public ResponseEntity<List<ProjectMember>> getProjectMembers(@PathVariable Long projectId){
        Long userId = 1L;
        return  ResponseEntity.ok(projectMemberService.getProjectMembers(projectId, userId));
    }

    @PostMapping
    public ResponseEntity<MemberResponse> inviteMember(@PathVariable Long projectId, @RequestBody InviteMemberRequest request){
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.CREATED).body(
                projectMemberService.inviteMember(projectId, request, userId)
        );
    }

    @PatchMapping("/{memberId}")
    public ResponseEntity<MemberResponse> updateMemberRole(@PathVariable Long projectId, @PathVariable Long memberId, @RequestBody UpdateMemberRoleRequest request){
        Long userId = 1L;
        return ResponseEntity.ok(projectMemberService.updateMemberRole(projectId, memberId, request, userId));
    }

    @DeleteMapping("/{memberId}")
    public ResponseEntity<MemberResponse> deleteProjectMember(@PathVariable Long projectId, @PathVariable Long memberId, @RequestBody UpdateMemberRoleRequest request){
        Long userId = 1L;
        return ResponseEntity.ok(projectMemberService.deleteProjectMember(projectId, memberId, userId));
    }
}
