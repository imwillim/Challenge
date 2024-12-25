package org.assignment.interview.emails;

import org.assignment.interview.Request;
import org.assignment.interview.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/emails")
public class EmailController {
    private final EmailServiceImpl emailServiceImpl;

    @Autowired
    public EmailController(EmailServiceImpl emailServiceImpl) {
        this.emailServiceImpl = emailServiceImpl;
    }

    @PostMapping
    public ResponseEntity<Response> get(@RequestBody Request requestBody) {
        emailServiceImpl.call(requestBody);
        return ResponseEntity.ok(new Response(true, "1"));
    }
}
