package springmvcthirdAss;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	@RequestMapping("/login")
	public String showform() {
		return "login";
	}
	
	@RequestMapping(path="/processform",  method=RequestMethod.POST)
	public String handleform(@ModelAttribute User user,Model model) {
		System.out.println(user);
		
		return "success";
	}
	

}
