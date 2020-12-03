package com.github.chentianming11.spring.validation.base;

import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * @author 陈添明
 */
@Configuration
public class EnvironmentConfig implements EnvironmentAware {
    /**
     * Set the {@code Environment} that this component runs in.
     *
     * @param environment
     */
    @Override
    public void setEnvironment(Environment environment) {
        System.out.println(environment);
    }
}
