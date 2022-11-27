package com.stc.ebu.ebuauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EbuAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbuAuthApplication.class, args);
	}

}
