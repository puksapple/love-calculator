package com.seliniumExpress.lc.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seliniumExpress.lc.api.CreditInfoDto;

@Controller
public class BankTransaction {
	
	@RequestMapping("/creditForm")
	public String creditCardForm(@ModelAttribute("cr") CreditInfoDto dto) {
		return "creditForm";
	}
	
	@RequestMapping("/showCredit")
	public String showCreditPage(@Valid @ModelAttribute("cr") CreditInfoDto dto, BindingResult result ) {
		if(result.hasErrors()) {
			return "creditForm";
		}
		return "showCredit";
	}
}
