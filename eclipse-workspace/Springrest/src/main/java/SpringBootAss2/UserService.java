package SpringBootAss2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class UserService {
	private static List<User> data = new ArrayList<>();
	static{
		data.add(new User("rajesh" , "12345"));
		data.add(new User("kumar" , "98765"));
		
	}
	public boolean authenticate(User u) {
		User result = data.stream()
	.filter(p -> p.getUsername().equals(u.getUsername()) && p.getPassword().equals(u.getPassword()))
			.findFirst().orElse(null);
	if(result!= null) {
		return true;
	}else {
		return false;
	}
	}

}


