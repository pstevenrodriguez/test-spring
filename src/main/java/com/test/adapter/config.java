package com.test.adapter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
    @Bean
    public RestControllerHandler restControllerHandler() {
        return restControllerHandler();
    }

}
