//package com.github.chentianming11.spring.validation.base;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//public class Swagger2Config {
//
//
//    @Bean(value = "defaultApi2")
//    public Docket defaultApi2() {
//        Docket docket=new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(new ApiInfoBuilder()
//                        .title("交易助手后台接口文档")
//                        .description("# helicarrier RESTful APIs")
//                        .termsOfServiceUrl("http://dora.shtest.ke.com/")
//                        .version("1.0")
//                        .build())
//                //分组名称
//                .select()
//                //这里指定Controller扫描包路径
//                .apis(RequestHandlerSelectors.basePackage("com.github.chentianming11.spring.validation"))
//                .paths(PathSelectors.any())
//                .build();
//        return docket;
//    }
//}