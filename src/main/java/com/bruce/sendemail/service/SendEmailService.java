package com.bruce.sendemail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendEmailService {

    @Autowired
    private JavaMailSender mailSender;
    public void sendEmail(String toEmail,
                          String body,
                          String subject) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("************@gmail.com");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(subject);

        mailSender.send(message);
        System.out.println("mail sent!");
    }
}
