package com.acuityspace.neutral.news.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
	public DemoController() {
	}

	@GetMapping()
	public String getString() {
		return "Hello World";
	}
}
