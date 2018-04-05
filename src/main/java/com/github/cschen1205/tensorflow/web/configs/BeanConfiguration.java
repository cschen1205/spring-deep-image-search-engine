package com.github.cschen1205.tensorflow.web.configs;

import com.github.cschen1205.tensorflow.search.models.ImageSearchEngine;
import com.github.cschen1205.tensorflow.search.models.ImageSearchEngineInception;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {


    @Bean
    public ImageSearchEngine imageSearchEngine() {
        return new ImageSearchEngineInception();
    }

}
