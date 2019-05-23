package com.sunbin.test.spring.cloud.consumer.feign;

import org.springframework.stereotype.Component;

@Component
public class MessageRemoteHystrix implements MessageRemote {

	@Override
	public String getMessage(String name) {
		// TODO Auto-generated method stub
		return "consumer feign returns: feign call failure";
	}
}
