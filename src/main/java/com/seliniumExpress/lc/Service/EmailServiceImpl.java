package com.seliniumExpress.lc.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class EmailServiceImpl implements EmailService {
	@Autowired
	private JavaMailSender javaMailSender;
	public void emailService( String userName, String Email, String Result) {
		SimpleMailMessage m=new SimpleMailMessage();
		m.setTo(Email);
		m.setSubject("love calculator result");
		m.setText("hello "+" "+userName+"the result predicted by lovelycalculator is"+" "+Result);
		javaMailSender.send(m);

	}


}
