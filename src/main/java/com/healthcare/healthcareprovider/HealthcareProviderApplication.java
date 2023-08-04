package com.healthcare.healthcareprovider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HealthcareProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthcareProviderApplication.class, args);
	}

}
