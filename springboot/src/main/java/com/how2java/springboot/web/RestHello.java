package com.how2java.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHello {

	@RequestMapping("hello-rest")
	public String hello() {
		return "hello-rest";
	}
}
