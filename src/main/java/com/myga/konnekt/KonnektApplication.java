package com.myga.konnekt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@ConfigurationPropertiesScan
public class KonnektApplication {

    public static void main(String[] args) {
        SpringApplication.run(KonnektApplication.class, args);
    }

}
