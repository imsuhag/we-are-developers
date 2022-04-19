package com.developers.learn.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greet {

	@GetMapping("/greet")
	public ResponseEntity<String> greetUser(HttpServletRequest request, @RequestParam("name") String name) {
		ResponseEntity<String> greetingsResponse = null;
		HttpHeaders responseHeaders = new HttpHeaders();
		if(null == name || name.isEmpty()) {
			greetingsResponse = new ResponseEntity<>("Welcome Guest, if you are seeing this the chances are that GitHub Action to deploy in AKS worked.", responseHeaders,
					HttpStatus.OK);
		}else {
			greetingsResponse = new ResponseEntity<>("Welcome "+ name +", If you are seeing this the chances are that GitHub Action to deploy in AKS worked.", responseHeaders,
					HttpStatus.OK);
		}
		
		return greetingsResponse;
	}

	
}
