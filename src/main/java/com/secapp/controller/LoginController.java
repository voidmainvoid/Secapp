package com.secapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/hello")
	public String hello() {
		System.out.println("LoginController / hello()");
		return "hello";

	}

	@RequestMapping("/login")
	public String login() {
		return "login";

	}

	@RequestMapping("/")
	public String startIndex() {
		return "index";

	}

}
