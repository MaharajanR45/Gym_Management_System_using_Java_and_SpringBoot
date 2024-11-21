package com.example.GymServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GymServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymServerApplication.class, args);
	}

}
