package com.NotifEaze.NotifEaze.dto;

public class PushNotificationRequest {
    private String recipient;
    private String title;
    private String body;

    public PushNotificationRequest() {
    }

    public PushNotificationRequest(String recipient, String title, String body) {
        this.recipient = recipient;
        this.title = title;
        this.body = body;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
