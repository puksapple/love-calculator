package com.seliniumExpress.lc.validator;

import javax.validation.metadata.ValidateUnwrappedValue;	

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.seliniumExpress.lc.api.UserRegistrationDTO;
import com.seliniumExpress.lc.controllers.UserRegistration;

public class UsernameValidator implements Validator{

	public boolean supports(Class<?> clazz) {
		
		return UserRegistrationDTO .class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "xyz", "cant be empty");
		String userName=((UserRegistrationDTO)target).getUserName();
	if(!userName.contains("_")) {
		errors.rejectValue("userName", "abc","String should contain _");
	}
	}

}