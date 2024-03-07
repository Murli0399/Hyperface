package com.NotifEaze.NotifEaze.dto;

public class BasePushNotificationResponse {
    private boolean success;
    private String message;

    public BasePushNotificationResponse(String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}
