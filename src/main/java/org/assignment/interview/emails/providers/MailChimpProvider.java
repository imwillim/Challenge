package org.assignment.interview.emails.providers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MailChimpProvider implements EmailProvider {
    private final Logger logger = LoggerFactory.getLogger(MailChimpProvider.class);

    @Override
    public void sendEmail() {
        logger.info("MailChimp Email Provider interacted");
    }
}
