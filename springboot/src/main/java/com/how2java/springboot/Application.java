package com.how2java.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

//@ServletComponentScan
@SpringBootApplication
@EnableCaching
public class Application 
//extends SpringBootServletInitializer 
{

	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}*/

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
