package com.NotifEaze.NotifEaze.service;

import com.NotifEaze.NotifEaze.dto.BaseEmailResponse;

public interface EmailService {
    BaseEmailResponse sendEmail(String to, String subject, String body);
}
