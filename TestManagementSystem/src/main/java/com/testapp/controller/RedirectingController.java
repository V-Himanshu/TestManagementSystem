package com.testapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RedirectingController {

	@RequestMapping(value = "/{path}", method = RequestMethod.GET)
	public String loginPage(@PathVariable String path) {
		return path;
	}
}
