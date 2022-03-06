package com.example.demorefreshscope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(proxyBeanMethods = false)
public class DemoApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(DemoApplication.class)
				.web(WebApplicationType.SERVLET)
				.logStartupInfo(true)
				.run(args);
	}

}
