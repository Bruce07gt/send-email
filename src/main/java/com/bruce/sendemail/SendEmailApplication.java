package com.bruce.sendemail;

import com.bruce.sendemail.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SendEmailApplication {

	@Autowired
	private SendEmailService service;

	public static void main(String[] args) {
		SpringApplication.run(SendEmailApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggermail() {
		service.sendEmail("***********@gmail.com",
				"Este é o corpo da mensagem",
				"Titulo Ativo"
		);
	}
}
