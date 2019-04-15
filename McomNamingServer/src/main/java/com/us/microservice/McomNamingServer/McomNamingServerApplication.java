package com.us.microservice.McomNamingServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class McomNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(McomNamingServerApplication.class, args);
	}

}
