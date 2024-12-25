package org.assignment.interview;

public class Response {
    private boolean success;
    private String messageId;

    public Response(boolean success, String messageId) {
        this.success = success;
        this.messageId = messageId;
    }

    public boolean isSuccessful() {
        return this.success;
    }

    public String getMessageId() {
        return this.messageId;
    }
}
