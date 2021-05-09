package com.seliniumExpress.lc.controllers;

import javax.servlet.http.Cookie;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.seliniumExpress.lc.Service.EmailService;
import com.seliniumExpress.lc.Service.EmailServiceImpl;
import com.seliniumExpress.lc.api.UserEmailDto;
import com.seliniumExpress.lc.api.UserInfoDto;
import com.seliniumExpress.lc.validator.EmailValidator;

@Controller
public class EmailController {
	@Autowired
	EmailServiceImpl  EmailServiceImpl;


	// @RequestMapping("/showEmail/{username}") show email ko paxadi jun url aayeni
	// tyo show email nai hunxa
	@RequestMapping("/showEmail")
	public String showEmailPage(Model m) {
		m.addAttribute("ue", new UserEmailDto());

		return "email-page";
	}

	// @RequestMapping("{username}/emailProcess")//email process ko agadi jun url
	// aayeni tyo email process nai hunxa
	@RequestMapping("/emailProcess")
	public String emailProcess(@Valid @ModelAttribute("ue") UserEmailDto de,@SessionAttribute("UserInfo") UserInfoDto udt,BindingResult result) {
		if (result.hasErrors()) {
			return "email-page";
		} 
		
			
			EmailServiceImpl.emailService(udt.getUserName(),de.getEmail(),udt.getAppResult());
	
			return "emailResult-page";  

		

	}

	@InitBinder
	public void initBinder(WebDataBinder bind) {
		bind.addValidators(new EmailValidator());
	}
}
