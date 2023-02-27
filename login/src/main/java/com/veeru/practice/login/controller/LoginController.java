package com.veeru.practice.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.veeru.practice.login.repository.UserModel;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class LoginController {

	@GetMapping("/")
	public String indexPage() {
		return "index";
	}
	@GetMapping(value="/login")
	public String loginPage(Model model) {
		model.addAttribute("login",new UserModel());
		return "index";
	}
	@PostMapping(value="/login")
	public String welcomePage(@ModelAttribute UserModel userModel,Model model) {
		model.addAttribute("login",userModel);
		return "welcome";
	}

}
