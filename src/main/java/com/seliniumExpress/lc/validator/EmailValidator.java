package com.seliniumExpress.lc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.seliniumExpress.lc.api.UserEmailDto;

public class EmailValidator implements Validator{

	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return UserEmailDto.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "email.blank","email must be provided");
		
		
	}

}
