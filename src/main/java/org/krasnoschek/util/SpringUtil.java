package org.krasnoschek.util;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringUtil implements ApplicationContextAware {

    private static ApplicationContext context;

    public static <T> T getBean(String beanName){
        return (T)context.getBean(beanName);
    }

    public static <T> T getBean(Class clazz){
        return (T)context.getBean(clazz);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringUtil.context = applicationContext;
    }
}
