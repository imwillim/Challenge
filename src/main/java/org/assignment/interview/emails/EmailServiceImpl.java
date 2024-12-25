package org.assignment.interview.emails;

import org.assignment.interview.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
    private final EmailProviderFactory emailProviderFactory;

    @Autowired
    public EmailServiceImpl(EmailProviderFactory emailProviderFactory) {
        this.emailProviderFactory = emailProviderFactory;
    }

    @Override
    public void call(Request request) {
        this.emailProviderFactory.call(request);
    }
}
