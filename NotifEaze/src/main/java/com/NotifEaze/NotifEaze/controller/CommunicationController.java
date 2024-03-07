package com.NotifEaze.NotifEaze.controller;

import com.NotifEaze.NotifEaze.dto.*;
import com.NotifEaze.NotifEaze.service.EmailService;
import com.NotifEaze.NotifEaze.service.PushNotificationService;
import com.NotifEaze.NotifEaze.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/communication")
public class CommunicationController {

    @Autowired
    private SmsService smsService;

    @Autowired
    private EmailService emailService;

    @Autowired
    private PushNotificationService pushNotificationService;

    public CommunicationController() {
    }

//    @PostMapping("/send-sms")
//    public ResponseEntity<BaseSmsResponse> sendSms() {
//        /* To be developed */
//        return ResponseEntity.ok().build();
//    }

    @PostMapping("/send-sms")
    public ResponseEntity<BaseSmsResponse> sendSms(@RequestBody SmsRequest request) {
        BaseSmsResponse response = smsService.sendSms(request.getPhoneNumber(), request.getMessage());
        return ResponseEntity.ok(response);
    }

//    @PostMapping("/send-email")
//    public ResponseEntity<BaseEmailResponse> sendEmail() {
//        /* To be developed */
//        return ResponseEntity.ok().build();
//    }
    @PostMapping("/send-email")
    public ResponseEntity<BaseEmailResponse> sendEmail(@RequestBody EmailRequest request) {
        BaseEmailResponse response = emailService.sendEmail(request.getTo(), request.getSubject(), request.getBody());
        return ResponseEntity.ok(response);
    }

//    @PostMapping("/send-notification")
//    public ResponseEntity<BasePushNotificationResponse> sendNotification() {
//        /* To be developed */
//        return ResponseEntity.ok().build();
//    }

    @PostMapping("/send-notification")
    public ResponseEntity<BasePushNotificationResponse> sendNotification(@RequestBody PushNotificationRequest request) {
        BasePushNotificationResponse response = pushNotificationService.sendNotification(request.getRecipient(), request.getBody());
        return ResponseEntity.ok(response);
    }

}
