package com.acuityspace.neutral.news.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingController {

	@PostMapping(path = "/test", consumes = { "text/plain", "application/*" }, produces = { "text/plain",
			"application/*" })
	public ResponseEntity<?> postMessage(@RequestBody String studentName) {
		return new ResponseEntity<String>("S", HttpStatus.OK);
	}

}
