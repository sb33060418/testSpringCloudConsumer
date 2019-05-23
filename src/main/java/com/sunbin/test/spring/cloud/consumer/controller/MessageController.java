package com.sunbin.test.spring.cloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class MessageController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/get")
	public String getMessage(String name) {
		String message = restTemplate.getForObject("http://service-provider/provider/get" + "?name=" + name,
				String.class);
		return "consumer returns: " + message;
	}

}
