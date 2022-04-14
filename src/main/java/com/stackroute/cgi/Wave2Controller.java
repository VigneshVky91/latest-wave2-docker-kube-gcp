package com.stackroute.cgi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Wave2Controller {

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to IBM NHT Wave 2 batch";
	}

	@GetMapping("/")
	public String sayHi() {
		return "Default message";
	}
}
