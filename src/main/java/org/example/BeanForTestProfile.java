package org.example;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Profile("test")
public class BeanForTestProfile extends AppBean {
    
    public BeanForTestProfile(@Value("${spring.application.name}") String name) {
        appName = name;
        logger = LoggerFactory.getLogger(BeanForTestProfile.class);
    }
    
    @PostConstruct
    public void init() {
        logger.info("BeanForTestProfile is created in " + appName);
    }
    
    @PreDestroy
    public void destroy() {
        logger.info("BeanForTestProfile is destroyed in " + appName);
    }
}
