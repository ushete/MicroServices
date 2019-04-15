package com.us.microservice.DwhService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DwhServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DwhServiceApplication.class, args);
	}

}
