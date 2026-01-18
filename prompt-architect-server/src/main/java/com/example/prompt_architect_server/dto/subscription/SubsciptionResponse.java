package com.example.prompt_architect_server.dto.subscription;

import java.time.Instant;

public record SubsciptionResponse(
        PlanResponse plan,
        String status,
        Instant periodEnd,
        Long tokenUsedThisCycle
) {
}
