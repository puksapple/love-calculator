package practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("firstname")
public class practicemodel {
	
	@RequestMapping("/first")
	public String first(Model m) {
		m.addAttribute("firstname","ram");
		m.addAttribute("lastname","aryal");
		m.addAttribute("next","second");
		return "practice";
	}
	
	@RequestMapping("/second")
	public String second(Model m,SessionStatus status) {
		
	m.addAttribute("next","third");

	status.setComplete();
	
		return "practice";
		 
	}
	
	@RequestMapping("/third")
	public String third(Model m,SessionStatus status){
		
		
		return "practice";
	}
}
