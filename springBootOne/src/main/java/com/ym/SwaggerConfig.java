package com.ym;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Created by Administrator on 2018/9/3 0003.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api_lf(){
        return  new Docket(DocumentationType.SWAGGER_2)
                .groupName("api_ym")
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false)
                .pathMapping("/")
                .select()
                .paths(or(regex("/com.ym/.*")))
                .build()
                .apiInfo(apiInfo());

    }

    /**
     *  构建api文档详细信息
     */
    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "ym API",// 标题
                "API 描述说明",//描述
                "1.0",//版本
                "NO terms of service",
                "ym@qq.com",// 创建人
                "The Apache License, Version 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0.html"
        );
        return apiInfo;
    }
}
