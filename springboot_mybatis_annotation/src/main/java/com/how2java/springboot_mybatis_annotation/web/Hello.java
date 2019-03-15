package com.how2java.springboot_mybatis_annotation.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {

	@RequestMapping("hello_mybatis")
	public String hello() {
		return "hello_mybatis";
	}
}
