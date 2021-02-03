package combat.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import combat.data.UserRepository;

@Controller
@RequestMapping("/Login")
public class LoginController {
	
	private UserRepository userRepo;
	
	
}
