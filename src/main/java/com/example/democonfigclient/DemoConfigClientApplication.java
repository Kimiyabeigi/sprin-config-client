package com.example.democonfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigurationProperties({SignatureConfig.class})
public class DemoConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoConfigClientApplication.class, args);
    }

}
