package com.study.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration  //声明当前类是配置类
@EnableSwagger2 //启用swagger
@ComponentScan(basePackages = {"com.study.swagger.controller"}) //扫描controller包
public class SwaggerConfig {

    @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("Zy", "http://www.baidu.com", "zhangyu197406@126.com");
        return new ApiInfoBuilder()
                .title("xxx项目API接口")
                .description("xxx项目API接口描述")
                .contact(contact)
                .version("1.0.0")
                .build();
    }

}
