package com.rappi.co;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient 		// It acts as a eureka client
@EnableZuulProxy
public class RappiBetappigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RappiBetappigatewayApplication.class, args);
	}

}
