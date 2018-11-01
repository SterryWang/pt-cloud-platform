package com.example.democonsumernoreg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController("/")
public class DemoController {
	@Autowired
	RestTemplate   restTemplate;
	@GetMapping("helloclient")
	public String helloClient() {
		return restTemplate.getForObject("http://demo-microservice/hello", String.class);
		
	}
	/**
	 * 测试经过zuul来访问
	 * @return
	 */
	@GetMapping("helloclient/viazuul")
	public String helloClientViaZuul() {
		return restTemplate.getForObject("http://zuul-gateway/demo-microservice/hello", String.class);
		
	}

}
