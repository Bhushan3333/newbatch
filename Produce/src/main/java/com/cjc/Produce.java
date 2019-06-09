package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Produce {

	public static void main(String[] args) {
		SpringApplication.run(Produce.class, args);
	}

	
	@Bean
	public RestTemplate restTemplate()
	{
		RestTemplate r=new RestTemplate();
		return r;
	}
}
