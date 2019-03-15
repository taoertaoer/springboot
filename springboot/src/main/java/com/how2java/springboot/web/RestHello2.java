package com.how2java.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestHello2 {

	@RequestMapping("hello-hello")
	public String hello() {
		return "hello";
	}
}
