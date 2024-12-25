package org.assignment.interview.emails.providers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SendGripEmailProvider implements EmailProvider {
    private final Logger logger = LoggerFactory.getLogger(SendGripEmailProvider.class);

    @Override
    public void sendEmail() {
        logger.info("SendGrip Email Provider interacted");
    }
}
