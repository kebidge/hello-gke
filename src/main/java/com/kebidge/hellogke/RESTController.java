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

	@GetMapping("/fidel")
	public String helloFidel() {
		return "Hello Fidel!";
	}

	@GetMapping("/pipeline")
	public String helloPipeline() {
		return "Build - Test - Deploy";
	}

	@GetMapping("/hello/{parameter}")
	public String helloParameter(@PathVariable String parameter) {
		return "Hello " + parameter + "!";
	}
}