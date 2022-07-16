package com.trax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trax.entities.User;
import com.trax.services.LoginService;
import com.trax.utils.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@Autowired
	private LoginService loginService;
	

	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestParam("to") String to, @RequestParam("sub") String sub, @RequestParam("body") String body, ModelMap model) {
		emailService.sendSimpleMessage(to, sub, body);
		model.addAttribute("msg", "Email Sent!!");
		return "compose_email";
	}
	
	@RequestMapping("/getPassword")
	public String getPassword(@RequestParam("email") String email, ModelMap model) {
		User user = loginService.findByEmail(email);
		
		String to = user.getEmail();
		String sub = "Forgot Password";
		String body = "Your username is "+user.getEmail()+" and password is "+user.getPassword()+".";
		
		emailService.sendSimpleMessage(to, sub, body);
		model.addAttribute("msg", "An email with your user name and password has been sent to your registered email id.");
		return "login_page";
	}
	
}
