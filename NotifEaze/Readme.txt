# Notification Integration Service

This Spring Boot application provides a raw framework for integrating with multiple SMS, email, and notification vendors.
It defines interfaces for SMS, email, and notification services.

## Project Structure

The project is structured as follows:

- `src/main/java/com/NotifEaze/NotifEaze/service`: Contains interface definitions for SMS, email, and notification services.
- `src/main/java/com/NotifEaze/NotifEaze/service/impl`: Contains sample implementations for Gupshup (SMS, email, PN) and Kaylera (SMS, Email, PN). (To be created)
- `src/main/java/com/NotifEaze/NotifEaze/controller`: Contains a sample controller for testing the services. (To be created)
- `src/test`: Contains unit tests for the services (not provided in this example). (Optional)
- `src/main/java/com/NotifEaze/NotifEaze/mock/GupshupMock`: This is a Java class providing mocked responses for various communication channels, including SMS, email, and push notifications. It is designed to be used for testing purposes to simulate different scenarios and responses from the Gupshup API or a similar communication service.


# Implement Vendor-Specific Interfaces
    - Import the project
    - To use this framework with specific vendors like Gupshup and Kaylera,
    - you need to implement the corresponding interfaces:
        EmailService
        PushNotificationService
        SmsService
    - since we are not integrating with Gupshup and Kaylera directly,
    we can use mock class (GupshupMock/KayleraMock) to get the response of respective APIs

# `src/main/java/com/NotifEaze/NotifEaze/controller`: Contains a sample controller for testing the services. (To be created)
    Create API's to send sms/email

# (BONUS REQUIREMENT) Since we are integrating multiple vendors for sms/email/pn there should be some configuration which will decide which vendor to route to (upto the developer to decide the logic)