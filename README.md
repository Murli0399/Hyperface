# Notification Integration Service

This Spring Boot application provides a framework for integrating with multiple SMS, email, and notification vendors. It defines interfaces for SMS, email, and notification services.

## Project Structure
The project is structured as follows:
- `src/main/java/com/NotifEaze/NotifEaze/service`: Contains interface definitions for SMS, email, and notification services.
- `src/main/java/com/NotifEaze/NotifEaze/service/impl`: Contains sample implementations for Gupshup (SMS, email, PN) and Kaylera (SMS, Email, PN).
- `src/main/java/com/NotifEaze/NotifEaze/controller`: Contains a sample controller for testing the services.
- `src/main/java/com/NotifEaze/NotifEaze/mock`: Contains mock classes for testing purposes.
- `src/test`: Contains unit tests for the services (optional).

## Configuration
- Configure the SMS, email, and push notification vendor details in `application.properties` or `application.yml`.
- For Gupshup and Kaylera, utilize the provided mock classes for testing purposes.

## How to Use
1. **Implement Vendor-Specific Interfaces:**
    - Implement the `EmailService`, `PushNotificationService`, and `SmsService` interfaces for specific vendors.

2. **Configure Application Properties:**
    - Set the vendor-specific details in `application.properties` or `application.yml`.

3. **Use Mock Classes for Testing:**
    - During development, use the provided mock classes for Gupshup and Kaylera to simulate different scenarios.

4. **Create API Endpoints for Testing:**
    - In the `CommunicationController`, implement API endpoints for sending SMS, email, and push notifications.

5. **Run the Application:**
    - Build and run the Spring Boot application.
    - Access the APIs defined in the `CommunicationController` to test the services.

## API Endpoints
- `POST /api/communication/send-sms`: Send SMS
- `POST /api/communication/send-email`: Send Email
- `POST /api/communication/send-notification`: Send Push Notification

## Bonus Requirement: Vendor Routing Configuration
- Implement logic in the service implementations or controllers to route requests to specific vendors based on configuration.

## Contributors
- Murli Khaire
