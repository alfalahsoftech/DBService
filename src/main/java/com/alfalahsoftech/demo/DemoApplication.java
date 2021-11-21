package com.alfalahsoftech.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@EnableEurekaClient
//public class DemoApplication{
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private ApplicationContext appContext;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@RequestMapping(value = "/")
	public String hello() {
		System.out.println("this::"+this);
		return "Default valued";
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println(appContext.getBean("topicBn"));
	//Arrays.asList(appContext.getBeanDefinitionNames()).stream().sorted().forEach(System.out::println);


	}

}

//https://mkyong.com/spring-boot/how-to-display-all-beans-loaded-by-spring-boot/
/*
 * 2. CommandLineRunner as Bean
Just different ways to print the loaded beans.

Application.java

package com.mkyong;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner run(ApplicationContext appContext) {
        return args -> {

            String[] beans = appContext.getBeanDefinitionNames();
            Arrays.stream(beans).sorted().forEach(System.out::println);

        };
    }

}

*/
