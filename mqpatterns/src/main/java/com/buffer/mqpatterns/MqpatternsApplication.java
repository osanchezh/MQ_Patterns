package com.buffer.mqpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.jms.annotation.EnableJms;


@SpringBootApplication
@EnableIntegration
@EnableJms
@ComponentScan
@EnableAutoConfiguration
public class MqpatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MqpatternsApplication.class, args);
	}

}
