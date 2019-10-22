package com.stackroute.muzixapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class MuzixApp {

	public static void main(String[] args) {
		SpringApplication.run(MuzixApp.class, args);
	}

}
