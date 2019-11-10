package com.testapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.testapp.model.LoginData;
import com.testapp.service.ValidationService;

@Controller
public class ValidationController {

	@Autowired
	ValidationService validationService;

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	ModelAndView loginProcess(@Valid LoginData loginData) {
		if ((validationService.validateLoginService(loginData)) != null)
			return new ModelAndView("student_page");
		return new ModelAndView("login");
	}
}
