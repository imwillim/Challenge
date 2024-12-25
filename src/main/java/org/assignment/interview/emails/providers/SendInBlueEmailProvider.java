package org.assignment.interview.emails.providers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SendInBlueEmailProvider implements EmailProvider {
    private final Logger logger = LoggerFactory.getLogger(SendInBlueEmailProvider.class);

    @Override
    public void sendEmail() {
        logger.info("SendInBlue Email Provider interacted");
    }
}
