package com.NotifEaze.NotifEaze.dto;

public class BaseSmsResponse {
    private boolean success;
    private String message;

    public BaseSmsResponse(boolean success, String message) {
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
