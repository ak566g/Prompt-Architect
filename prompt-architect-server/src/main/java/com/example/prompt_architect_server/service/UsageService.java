package com.example.prompt_architect_server.service;

import com.example.prompt_architect_server.dto.subscription.PlanLimitResponse;
import com.example.prompt_architect_server.dto.usage.UsageTodayResponse;

public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
