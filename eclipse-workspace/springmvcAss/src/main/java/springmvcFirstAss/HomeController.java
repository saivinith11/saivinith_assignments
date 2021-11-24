package springmvcFirstAss;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/index")
	public String home() {
		System.out.println("this is index page and has a hyper link once u click on hyperlink it will redirect to helloworldcontroller");
	    return "index1";
	}
	

}
