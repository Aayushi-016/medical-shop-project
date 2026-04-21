package com.medical.shop.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;
    public void sendEmail(String name, String phone, String items){
        SimpleMailMessage mssg = new SimpleMailMessage();
        mssg.setTo("mohanmedicosurgico@gmail.com");
        mssg.setSubject("New Order Request");

        mssg.setText(
                "New Request Received:\n\n" +
                        "Name: " + name + "\n" +
                        "Phone: " + phone + "\n" +
                        "Items: " + items
        );
        mailSender.send(mssg);
    }
}
