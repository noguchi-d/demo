package com.example.demo;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Created by noguchi on 17/05/28.
 */
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        packages("com.example.demo.resource");
    }
}
