package com.glqdlt.ex.springbootstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MySetupConfig {
    @ConditionalOnMissingBean(MySetup.class)
    @Bean
    public MySetup mySetup() {
        MySetup mySetup = new MySetup();
        mySetup.setPrefix("default");
        mySetup.setAutoSetup(true);
        return mySetup;
    }
}
