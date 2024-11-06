package com.buffer.mqmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class MqmvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(MqmvcApplication.class, args);
	}

}
