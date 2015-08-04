package com.logos.java.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.logos.java.entity.User;
import com.logos.java.service.impl.UserServiceImpl;


@Controller
@RequestMapping(value = "/register")
public class RegisterController {
	UserServiceImpl us = new UserServiceImpl();
	
	 @RequestMapping(method = RequestMethod.GET)
	    public String viewRegistration(Map<String, Object> model) {
	        User userForm = new User();    
	        model.put("userForm", userForm);
	                       
	        return "registration";
	    }
	     
	    @RequestMapping(method = RequestMethod.POST)
	    public String processRegistration(@ModelAttribute("userForm") User user,
	            Map<String, Object> model) {
	         
	    		us.addUser(user);
	                 
	        return "registrationSuccess";
	    }
}
