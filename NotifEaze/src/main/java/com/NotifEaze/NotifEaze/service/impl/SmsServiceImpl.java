package com.NotifEaze.NotifEaze.service.impl;

import com.NotifEaze.NotifEaze.dto.BaseSmsResponse;
import com.NotifEaze.NotifEaze.dto.SmsDeliveryStatus;
import com.NotifEaze.NotifEaze.mock.GupshupMock;
import com.NotifEaze.NotifEaze.service.SmsService;
import org.springframework.stereotype.Service;

@Service
public class SmsServiceImpl implements SmsService {
    @Override
    public BaseSmsResponse sendSms(String phoneNumber, String message) {
        GupshupMock gupshupMock = new GupshupMock();
        BaseSmsResponse response = new BaseSmsResponse(true,gupshupMock.smsMockedResponses().get("MessageId1"));
        return response;
    }

    @Override
    public SmsDeliveryStatus checkDeliveryStatus(String messageId) {
        GupshupMock gupshupMock = new GupshupMock();
        SmsDeliveryStatus response = new SmsDeliveryStatus(gupshupMock.smsDeliveryStatusMockedResponses().get(messageId));
        return response;
    }
}
