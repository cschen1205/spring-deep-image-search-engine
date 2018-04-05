package com.github.cschen1205.tensorflow.web.configs;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * Created by xschen on 5/10/2017.
 * online developer resource: http://www.baeldung.com/swagger-2-documentation-for-spring-rest-api
 * url: http://localhost:8081/v2/api-docs
 * ui-url: http://localhost:8081/swagger-ui.html
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
   @Bean
   public Docket api() {
      return new Docket(DocumentationType.SWAGGER_2)
              .select()
              .apis(RequestHandlerSelectors.any())
              .paths(PathSelectors.ant("/api/**"))
              .build()
              .apiInfo(apiInfo());
   }

   private ApiInfo apiInfo() {
      ApiInfo apiInfo = new ApiInfo(
              "Java Deep Learning REST API",
              "Documentation on Java Deep Learning",
              "API 1.0.1",
              "Terms of service",
              "cschen1205@gmail.com",
              "Commercial",
              "Commercial Licence");
      return apiInfo;
   }
}

