package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AuthenticationController {

	@GetMapping("api/login")
	public String Login() {
		return"Java is Not an Ocen-login API";
	}
	@PostMapping("api/create")
	public String CreateAccount() {
		return"Java is Not an Ocen- SignUp API";
	}
	@DeleteMapping("api/reset")
	public String Resetpassword() {
		return"Java is Not an Ocen- Delete API";
	}
	
}
