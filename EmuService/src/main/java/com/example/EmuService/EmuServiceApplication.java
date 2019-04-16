package com.example.EmuService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmuServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmuServiceApplication.class, args);
	}

}
