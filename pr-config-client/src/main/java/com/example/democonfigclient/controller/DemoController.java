package com.example.democonfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	
	@Value("${myname}")
	String myName;
	@Value("${server.port}")
	String port;
	@GetMapping(value="/getRemoteProps")
	public  String getRemoteProps() {
		return  "myname="+myName+";server.port="+port;
		
		
	}

}
