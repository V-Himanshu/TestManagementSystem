package com.testapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.testapp.model.UserData;
import com.testapp.service.InsertService;

@Controller
public class InsertController {

	@Autowired
	InsertService insertService;

	@RequestMapping(value = "/signupRequest", method = RequestMethod.POST)
	public ModelAndView signupRequest(@Valid UserData userData) {
		System.out.println(userData);
		insertService.insertUserRegistrationData(userData);
		return new ModelAndView("login");
	}
}
