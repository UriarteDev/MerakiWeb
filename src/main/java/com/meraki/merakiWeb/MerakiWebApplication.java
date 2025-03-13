package com.meraki.merakiWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@EntityScan(basePackages = "com.meraki.entity")
public class MerakiWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MerakiWebApplication.class, args);
	}

}
