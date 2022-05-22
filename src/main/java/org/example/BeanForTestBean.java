package org.example;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Component
@ConditionalOnBean(BeanForTestProfile.class)
public class BeanForTestBean extends AppBean {
    @Value("#{'${special_values}'.split(', ')}")
    private List<Integer> values;
    
    public BeanForTestBean(@Value("${spring.application.name}") String name) {
        appName = name;
        logger = LoggerFactory.getLogger(BeanForTestBean.class);
    }
    
    @PostConstruct
    public void init() {
        logger.info("BeanForTestBean is created in " + appName);
        
        logger.info(values.toString());
    }
    
    @PreDestroy
    public void destroy() {
        logger.info("BeanForTestBean is destroyed in " + appName);
    }
}
