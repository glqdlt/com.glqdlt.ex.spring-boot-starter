package com.glqdlt.ex.springbootstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties(MySetupProperty.class)
public class MySetupConfig {
    @ConditionalOnMissingBean(MySetup.class)
    @Bean
    public MySetup mySetup(MySetupProperty mySetupProperty) {
        MySetup mySetup = new MySetup();
        mySetup.setPrefix(mySetupProperty.getPrefix());
        mySetup.setAutoSetup(mySetupProperty.isAuto());
        return mySetup;
    }
}
