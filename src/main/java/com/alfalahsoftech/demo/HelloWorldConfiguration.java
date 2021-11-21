package com.org.cg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//should be used as source of bean definitn by IOC
@Configuration
public class HelloWorldConfiguration {

	@Bean(name="myBean") //should be treated as bean by IOC
	public HelloWorld getHelloWorld(){
		return new HelloWorld();
	}
}
