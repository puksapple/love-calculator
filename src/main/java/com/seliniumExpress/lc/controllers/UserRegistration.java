package com.seliniumExpress.lc.controllers;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seliniumExpress.lc.PropertyEditior.NamePropertyEditior;
import com.seliniumExpress.lc.api.CommunicationChannnelDto;
import com.seliniumExpress.lc.api.Phone;
import com.seliniumExpress.lc.api.UserRegistrationDTO;
import com.seliniumExpress.lc.validator.UsernameValidator;

@Controller
public class UserRegistration {

	
	@RequestMapping("/register")
	public String showRegisterPage(@ModelAttribute("ur")UserRegistrationDTO user) {
		
		return "register-page";
}
	@RequestMapping("/registerprocess")
public String showRegisterProcess(@Valid @ModelAttribute("ur") UserRegistrationDTO user,BindingResult result) {
		if(result.hasErrors()) {
			return "register-page";
		}
	return "show-register";
}
	@InitBinder
	public void initBinder(WebDataBinder bind) {
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor customDateEditor=new CustomDateEditor(format, true);
		bind.registerCustomEditor(Date.class, "date", customDateEditor);
		
		NamePropertyEditior editior=new NamePropertyEditior();
		bind.registerCustomEditor(String.class, "name", editior);
		
		UsernameValidator validator=new UsernameValidator();
		bind.addValidators(validator);
		
		
	}
	
}
