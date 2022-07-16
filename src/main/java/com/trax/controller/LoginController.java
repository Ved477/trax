package com.trax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trax.entities.User;
import com.trax.services.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	@RequestMapping("/registration")
	public String registration() {
		return "registration_page";
	}
	
	@RequestMapping("/viewloginPage")
	public String viewloginPage() {
		return "login_page";
	}
	
	@RequestMapping("/register")
	public String saveRegistration(@ModelAttribute User user) {
		loginService.saveUser(user);
		return "login_page";
	}
	
	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("email") String email, @RequestParam("password") String password, ModelMap model) {
		User user = loginService.findByEmail(email);
		if(user!=null) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				return "create_lead";
			}else {
				model.addAttribute("error", "Invalid EmailId / Password!!!");
				return "login_page";
			}
		}else {
			model.addAttribute("error", "Invalid EmailId / Password!!!");
			return "login_page";
		}
	}
	
	@RequestMapping("/forgotPassword")
	public String forgotPassword() {
		return "forgot_password_page";
	}
	
	
}
