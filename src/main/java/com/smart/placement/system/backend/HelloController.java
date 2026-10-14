
package com.smart.placement.system.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class HelloController {
	@GetMapping("/api/hello")
	public String hello() {
		return "Smart Placement backend is running!";
	}
}