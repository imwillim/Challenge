package org.assignment.interview.emails.providers;

public class NotFoundProviderException extends RuntimeException {
    public NotFoundProviderException() {
        super("Provider not found");
    }
}
