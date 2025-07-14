package in.adarshit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestAPI {

	@GetMapping("/welcome")
	public String getWelcomeAPI() {
		return "Welcome to Rest API";
	}

}
