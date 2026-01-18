package com.example.prompt_architect_server.service;

import com.example.prompt_architect_server.dto.subscription.CheckoutRequest;
import com.example.prompt_architect_server.dto.subscription.CheckoutResponse;
import com.example.prompt_architect_server.dto.subscription.PortalResponse;
import com.example.prompt_architect_server.dto.subscription.SubsciptionResponse;

public interface SubscriptionService {
    SubsciptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
