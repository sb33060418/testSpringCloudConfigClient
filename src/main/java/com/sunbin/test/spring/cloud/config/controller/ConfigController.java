package com.sunbin.test.spring.cloud.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {

	@Value("${name}")
	private String name;

	@RequestMapping("/get")
	public String getMessage() {
		return "get config: name = " + name;
	}

}
