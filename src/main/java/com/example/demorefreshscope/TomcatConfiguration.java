package com.example.demorefreshscope;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TomcatConfiguration {

    @Bean
    public ConfigurableServletWebServerFactory customServletWebServerFactory(
            final ServerProperties serverProperties) {
        return new CustomTomcatServletWebServerFactory(serverProperties);
    }
}
