package com.example.demorefreshscope;

import java.util.function.Function;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
public class RefreshableConfiguration {

	@Bean
	public Function<String, String> uppercase() {
		return value -> value.toUpperCase();
	}
}
