package com.NotifEaze.NotifEaze.dto;

public class SmsDeliveryStatus {
    private boolean delivered;
    private String statusMessage;

    public SmsDeliveryStatus(String statusMessage) {
        this.delivered = delivered;
        this.statusMessage = statusMessage;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public String getStatusMessage() {
        return statusMessage;
    }
}