package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "mongock")
public class MyConfiguration {
    private boolean enabled;
    private List<String> changeLogsScanPackage;
}
