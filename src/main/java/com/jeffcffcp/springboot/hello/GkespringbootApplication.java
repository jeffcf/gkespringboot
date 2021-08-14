package com.jeffcffcp.springboot.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GkespringbootApplication {

	public static void main(String[] args) {
		System.out.print("--------------------------------GkespringbootApplication start");
		
		SpringApplication.run(GkespringbootApplication.class, args);
		
		System.out.print("--------------------------------GkespringbootApplication end");
		
	}


}
