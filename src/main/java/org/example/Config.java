package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example")
@PropertySource("classpath:application-test.properties")
@PropertySource("classpath:application-dev.properties")
@PropertySource("classpath:application-prod.properties")
public class Config {
}
