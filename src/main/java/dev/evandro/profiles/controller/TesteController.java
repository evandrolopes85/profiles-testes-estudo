package dev.evandro.profiles.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

	//@Autowired
	//private Environment enviroment;
	
	/*@Value("${usuario}")
	private String username;
	
	@Value("${senha}")
	private String password;
	
	@GetMapping("/teste")
	public String recuperandoTag() {
		//return "username: "+ enviroment.getProperty("username") + " - \n password: " + enviroment.getProperty("password");
		return "username: "+ username + " - \n password: " + password;
	}*/
}
