package org.assignment.interview.emails;

import org.assignment.interview.Request;
import org.assignment.interview.emails.providers.EmailProvider;
import org.assignment.interview.emails.providers.MailChimpProvider;
import org.assignment.interview.emails.providers.NotFoundProviderException;
import org.assignment.interview.emails.providers.SendGripEmailProvider;
import org.assignment.interview.emails.providers.SendInBlueEmailProvider;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class EmailProviderFactory {
    private final Map<String, EmailProvider> emailProvider = new HashMap<>();
    private static final String WHITE_SPACE_REGEX = "\\s+";


    public EmailProviderFactory() {
        emailProvider.put("sendinblue", new SendInBlueEmailProvider());
        emailProvider.put("sendgrip", new SendGripEmailProvider());
        emailProvider.put("mailchimp", new MailChimpProvider());
    }

    public void call(Request requestBody) {
        String provider = requestBody.getProvider().trim().toLowerCase().replaceAll(WHITE_SPACE_REGEX,"");
        if (!emailProvider.containsKey(provider)) {
            throw new NotFoundProviderException();
        }
        emailProvider.get(provider).sendEmail();
    }

}
