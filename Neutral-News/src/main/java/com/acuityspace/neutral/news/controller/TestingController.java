package com.acuityspace.neutral.news.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingController {

	@RequestMapping(path = "/test", method = { RequestMethod.GET, RequestMethod.POST }, consumes = MediaType.ALL_VALUE, produces = MediaType.ALL_VALUE)
	public ResponseEntity<Object> testMessage(@RequestBody(required = false) String data) {
		if (data != null) {
			return new ResponseEntity<>("Testing Successful with data = {" + data + "}", HttpStatus.OK);
		}
		return new ResponseEntity<>("Testing Successful.", HttpStatus.OK);
	}
}
