package com.ServerEureka.ms0001server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Ms0001ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms0001ServerApplication.class, args);
	}

}
