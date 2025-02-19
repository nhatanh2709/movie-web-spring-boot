package com.example.notification_services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class NotificationServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationServicesApplication.class, args);
	}

}
