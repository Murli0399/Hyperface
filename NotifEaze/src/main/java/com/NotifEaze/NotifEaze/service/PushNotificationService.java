package com.NotifEaze.NotifEaze.service;

import com.NotifEaze.NotifEaze.dto.BasePushNotificationResponse;

public interface PushNotificationService {
    BasePushNotificationResponse sendNotification(String fcmToken, String message);
}
