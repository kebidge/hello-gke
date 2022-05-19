package com.kebidge.hellogke;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class RESTController {

    @RequestMapping("/")
	String helloWorld() {
		return "Hello World!";
	}

	@GetMapping("/kebidge")
	public String helloKebidge() {
		return "Hello Kebidge!";
	}

	@GetMapping("/hello/{parameter}")
	public String helloParameter(@PathVariable String parameter) {
		return "Hello " + parameter + "!";
	}
}