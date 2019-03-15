package com.how2java.springboot_mybatis_annotation.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MybatisController {

	@RequestMapping("mybatis_annonation")
	public String mybatis() {
		return "mybatis_annonation";
	}
}
