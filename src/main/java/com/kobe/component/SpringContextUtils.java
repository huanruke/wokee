package com.kobe.component;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * ApplicationContext工具类
 */
@Component
public class SpringContextUtils implements ApplicationContextAware {

    private SpringContextUtils(){}

    private static ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**
     * 获取上下文对象
     * @return ApplicationContext
     */
    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }
}
