package com.seliniumExpress.lc.config;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;		
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.seliniumExpress.lc.Formatter.AmountFormatter;
import com.seliniumExpress.lc.Formatter.CreditCardFormatter;
import com.seliniumExpress.lc.Formatter.PhoneNumberFormatter;

import java.util.Properties;


@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.seliniumExpress.lc.controllers,com.seliniumExpress.lc.Service") 
@PropertySource("classpath:Email.properties")
public class loveCalcConfig implements WebMvcConfigurer{
	@Autowired
	Environment env;
	
	@Bean
	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");
		return vr;
	
	}
	
public void addFormatters(FormatterRegistry register) {
	register.addFormatter(new PhoneNumberFormatter());
	register.addFormatter(new CreditCardFormatter());
	register.addFormatter(new AmountFormatter());
}
	@Bean
	public JavaMailSender getJavaMailSend() {
		
		String host=env.getProperty("mail.host");
		String username=env.getProperty("mail.username");
		String password=env.getProperty("mail.password");
		String port=env.getProperty("mail.port");
		
		JavaMailSenderImpl mail=new JavaMailSenderImpl();
		
		mail.setHost(host);
		mail.setUsername(username);
		mail.setPassword(password);
		mail.setPort(Integer.parseInt(port));
		
		Properties p=new Properties();
		p.put("mail.smtp.starttls.enable", true);
		p.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		mail.setJavaMailProperties(p);		
		return mail;
		
		
	}

}
