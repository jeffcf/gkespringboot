package com.jeffcffcp.springboot.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GkespringbootApplication {


	
	public static void main(String[] args) {
		logger.info("--------------------------------GkespringbootApplication start");
		
		SpringApplication.run(GkespringbootApplication.class, args);
		
		logger.info("--------------------------------GkespringbootApplication end");
		
	}


}
