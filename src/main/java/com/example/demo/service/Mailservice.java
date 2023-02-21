package com.example.demo.service;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.demo.controllers.LoginController;

@Service
public class Mailservice {
	
	@Autowired
    private JavaMailSender javaMailSender;
/*
	@Override
    public void run(String... args) throws MessagingException, IOException {

        System.out.println("Sending Email...");

        sendEmail();
		//sendEmailWithAttachment();

        System.out.println("Done");

    }
*/
    public void sendEmail() {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(LoginController.uname);

        msg.setSubject("LOGIN ALERT");
        msg.setText("This is to inform you that Your Account has been Login\n"
        		+ "If not You Please see to Activity \n");

        javaMailSender.send(msg);

    }

    void sendEmailWithAttachment() throws MessagingException, IOException {

        MimeMessage msg = javaMailSender.createMimeMessage();

        // true = multipart message
        MimeMessageHelper helper = new MimeMessageHelper(msg, true);
        helper.setTo("destination email");

        helper.setSubject("Testing from Spring Boot");

        // default = text/plain
        //helper.setText("Check attachment for image!");

        // true = text/html
        helper.setText("<h1>Check attachment for image!</h1>", true);

        //helper.addAttachment("my_photo.png", new ClassPathResource("android.png"));

        javaMailSender.send(msg);

    }

}
