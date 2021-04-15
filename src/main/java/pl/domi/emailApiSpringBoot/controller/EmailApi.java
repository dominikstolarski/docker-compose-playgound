package pl.domi.emailApiSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.domi.emailApiSpringBoot.domain.Email;
import pl.domi.emailApiSpringBoot.repository.EmailRepository;

@RestController
public class EmailApi {

    private final EmailRepository emailRepository;

    @Autowired
    public EmailApi(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    @GetMapping("/emails")
    public Iterable<Email> getEmails() {
        return emailRepository.findAll();
    }

    @PostMapping("/email")
    public void addEmail(@RequestBody Email email) {
        emailRepository.save(email);
    }
}
