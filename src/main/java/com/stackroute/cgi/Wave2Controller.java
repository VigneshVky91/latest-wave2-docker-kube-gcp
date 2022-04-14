package com.stackroute.cgi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Wave2Controller {

	@GetMapping("/message")
	public String getMessage() {
		return "Latest-Wave2_Docker-Kube-GCP is working successfully";
	}

	@GetMapping("/")
	public String sayHi() {
		return "Default message";
	}
}
