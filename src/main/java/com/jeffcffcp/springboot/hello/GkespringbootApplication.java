package com.jeffcffcp.springboot.hello;

import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class GkespringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(GkespringbootApplication.class, args);
		
		System.out.print("--------------------------------start end");
		
	}


}
