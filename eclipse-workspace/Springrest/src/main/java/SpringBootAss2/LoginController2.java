package SpringBootAss2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class LoginController2 {
	@Autowired
	private UserService service;
	
	@PostMapping(path= "/user")
	public String getUserLogin(@RequestBody User u) {
		if(service.authenticate(u)) {
			return "welcome" + u.getUsername();
			
		}else {
			return "incorrect login";
		}
	}
}
