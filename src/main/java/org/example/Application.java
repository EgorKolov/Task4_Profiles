package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // Logged in INFO
        ConfigurableApplicationContext context = SpringApplication.run(Config.class, args);
        
        //AppBean b1 = context.getBean(BeanForTestProfile.class);
        
        context.close();
    }
}
