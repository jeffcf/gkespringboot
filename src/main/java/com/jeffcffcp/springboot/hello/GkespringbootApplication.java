package com.jeffcffcp.springboot.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GkespringbootApplication {

	private static final Logger logger = LoggerFactory.getLogger(GkespringbootApplication.class);
	
	public static void main(String[] args) {
		logger.info("--------------------------------GkespringbootApplication start");
		
		SpringApplication.run(GkespringbootApplication.class, args);
		
		logger.info("--------------------------------GkespringbootApplication end 202108151045");
		
	}


}
