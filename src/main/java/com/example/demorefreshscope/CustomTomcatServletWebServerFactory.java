package com.example.demorefreshscope;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;

public class CustomTomcatServletWebServerFactory extends TomcatServletWebServerFactory {
    public CustomTomcatServletWebServerFactory(final ServerProperties serverProperties) {
        super(serverProperties.getPort());
    }
}
