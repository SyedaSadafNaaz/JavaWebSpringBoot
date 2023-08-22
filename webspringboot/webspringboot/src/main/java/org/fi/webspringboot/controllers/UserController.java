package org.fi.webspringboot.controllers;

import org.fi.webspringboot.pojo.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@GetMapping("/login")
	public void prepareUser(Model data) {
		System.out.println("Controller fired......");
		data.addAttribute("objUser",new UserInfo());
	}
	@PostMapping("/authenticate")
	public ModelAndView authenticate(@ModelAttribute("objUser")UserInfo objUser) 
	{
		if(objUser.getUserName().equals("sadaf")&& objUser.getPassword().equals("cdac"))
		  	//return "welcome";
			return new ModelAndView("welcome","message","Welcome Syeda to online shopping");
		else
			return new ModelAndView("failure","errorMessage","Invalid User Name and password");
	}
}
