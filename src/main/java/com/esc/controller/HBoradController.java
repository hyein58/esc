package com.esc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HBoradController {
	
	@RequestMapping(value="/hBoard", method= RequestMethod.GET)
	public String hBoard() {
		return "hi Board";
	}

}
