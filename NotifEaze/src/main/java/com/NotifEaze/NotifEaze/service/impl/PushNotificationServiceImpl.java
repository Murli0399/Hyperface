package com.NotifEaze.NotifEaze.service.impl;

import com.NotifEaze.NotifEaze.dto.BasePushNotificationResponse;
import com.NotifEaze.NotifEaze.mock.GupshupMock;
import com.NotifEaze.NotifEaze.service.PushNotificationService;
import org.springframework.stereotype.Service;

@Service
public class PushNotificationServiceImpl implements PushNotificationService {
    @Override
    public BasePushNotificationResponse sendNotification(String fcmToken, String message) {
        GupshupMock gupshupMock = new GupshupMock();
        BasePushNotificationResponse response = new BasePushNotificationResponse(gupshupMock.pnMockedResponses().get(fcmToken));
        return response;
    }
}
