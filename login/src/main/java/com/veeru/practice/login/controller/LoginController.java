package com.veeru.practice.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class LoginController {

	@GetMapping("/")
	public String indexPage() {
		return "index";
	}
	@GetMapping(value="/login")
	public String loginPage() {
		return "index";
	}
	@GetMapping(value="/welcome")
	public String welcomePage() {
		return "welcome";
	}

}
