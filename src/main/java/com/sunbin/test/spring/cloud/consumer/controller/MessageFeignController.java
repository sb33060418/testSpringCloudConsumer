package com.sunbin.test.spring.cloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbin.test.spring.cloud.consumer.feign.MessageRemote;

@RestController
@RequestMapping("/feign")
public class MessageFeignController {

	@Autowired
	private MessageRemote messageRemote;

	@RequestMapping("/get")
	public String getMessageFeign(String name) {
		String message = messageRemote.getMessage(name);
		return "consumer feign returns: " + message;
	}
}
