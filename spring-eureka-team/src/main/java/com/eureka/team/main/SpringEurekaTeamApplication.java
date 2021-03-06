package com.eureka.team.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringEurekaTeamApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaTeamApplication.class, args);
	}

}
