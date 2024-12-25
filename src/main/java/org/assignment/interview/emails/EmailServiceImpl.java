package org.assignment.interview.emails;

import org.assignment.interview.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl {
    private final EmailProviderFactory emailProviderFactory;

    @Autowired
    public EmailServiceImpl(EmailProviderFactory emailProviderFactory) {
        this.emailProviderFactory = emailProviderFactory;
    }

    public void call(Request request) {
        this.emailProviderFactory.call(request);
    }
}
