package com.seliniumExpress.lc.controllers;

import java.net.http.HttpRequest;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.seliniumExpress.lc.Service.LoveCalculationImpl;
import com.seliniumExpress.lc.api.UserInfoDto;

@Controller
@SessionAttributes("UserInfo")
public class appController {

	@Autowired
	private LoveCalculationImpl impl;
	@RequestMapping("/")
	public String showHomePage(Model m) {
		m.addAttribute("UserInfo",new UserInfoDto());
		return "home-page";
	}

	@RequestMapping("/showResult")
	public String showResultPage( Model m ,@Valid UserInfoDto dto ,BindingResult result) {
		m.addAttribute("UserInfo",dto);
		m.addAttribute(BindingResult.MODEL_KEY_PREFIX+"UserInfo",result);
		
		if (result.hasErrors()) {
			return "home-page";
		}
		
		
		String love_result=impl.lovecalc(dto.getUserName(), dto.getCrushName());
		
		dto.setAppResult(love_result);		
		
		
		
		return "result-page";

	}

}
