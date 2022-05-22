package org.example;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Profile("!default")
public class BeanForNoDefaultProfile extends AppBean {
    
    public BeanForNoDefaultProfile(@Value("${spring.application.name}") String name) {
        appName = name;
        logger = LoggerFactory.getLogger(BeanForNoDefaultProfile.class);
    }
    
    @PostConstruct
    public void init() {
        logger.info("BeanForNoDefault is created in " + appName);
    }
    
    @PreDestroy
    public void destroy() {
        logger.info("BeanForNoDefault is destroyed in " + appName);
    }
}
