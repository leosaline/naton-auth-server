package com.saline.naton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NatonAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NatonAuthServerApplication.class, args);
	}

}
