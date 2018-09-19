package com.test.useraddressservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UseraddressServiceApplication {

	@RequestMapping("/api/user/address")
	public String getUserAddress() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return "123 Main St \nNew York, NY - 10001";
	}


	public static void main(String[] args) {
		SpringApplication.run(UseraddressServiceApplication.class,
				"--spring.application.name=user-address-service",
				"--server.port=3002"
		);
	}
}