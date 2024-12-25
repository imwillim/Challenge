# Email Sending Service

This Spring Boot application demonstrates the use of the **Factory Method** design pattern to dynamically select an email provider service (e.g., Sendgrid, Mailchimp, Sendinblue) based on the user's input.

## How It Works
1. The user specifies the email details and desired provider in a POST request.
2. The `EmailService` delegates the provider selection to the `ProviderFactory`.
3. The selected provider processes the email and returns the response with customized message.

## Example Request
**Endpoint:**
```
POST /api/email/send
```

**Request Body:**
```json
{
  "email": "example@example.com",
  "message": "This is a test email.",
  "provider": "sendgridService"
}
```

**Response:**
```json
{
  "success": true,
  "messageId": "1"
}
```

