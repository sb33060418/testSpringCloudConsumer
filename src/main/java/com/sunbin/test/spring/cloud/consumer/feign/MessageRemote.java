package com.sunbin.test.spring.cloud.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-provider", fallback = MessageRemoteHystrix.class)
public interface MessageRemote {

	@RequestMapping(value = "/provider/get")
	public String getMessage(@RequestParam(value = "name") String name);
}
