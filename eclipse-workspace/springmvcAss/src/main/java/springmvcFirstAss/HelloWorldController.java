package springmvcFirstAss;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	@RequestMapping("/helloworld")
	public String index(Model model) {
		model.addAttribute("message","vinith");
		return "helloworld";
	}
	

}
