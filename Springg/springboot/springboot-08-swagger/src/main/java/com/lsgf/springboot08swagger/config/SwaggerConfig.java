package com.lsgf.springboot08swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

//
@Configuration
@EnableSwagger2  //开启Swagger2
public class SwaggerConfig {

    @Bean
    public Docket docket1() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("GroupA");
    }

    @Bean
    public Docket docket2() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("GroupB");
    }

    @Bean
    public Docket docket3() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("GroupC");
    }

    @Bean
    public Docket docket(Environment environment) {

        //设置要显示的Swagger环境
        Profiles profiles = Profiles.of("dev","test");
        //获取项目环境  通过 environment.acceptsProfiles 判断是否处在自己设定的环境当中
        boolean flag = environment.acceptsProfiles(profiles);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("hotwind")
                // enable() 是否启用swagger
                .enable(flag)
                .select()
                //RequestHandlerSelectors配置要扫描接口的方式
                //  basePackage:指定要扫描的包
                //  any()：扫描全部
                //  none():不扫描
                //  withClassAnnotation:扫描类上的注解
                .apis(RequestHandlerSelectors.basePackage("com.lsgf.springboot08swagger.controller"))
                //  path()：过滤的路径
//                .paths(PathSelectors.ant("/lsgf/**"))
                .build();
    }

    //作者信息
    Contact contact = new Contact("lsgf", "https://www.bilibili.com/", "1251201363@qq.com");

    //配置Swagger信息=apiInfo
    private ApiInfo apiInfo() {
        return new ApiInfo("lsgf SwaggerAPIDocument",
                "HelloWorld",
                "1.0",
                "https://www.bilibili.com/",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());

    }


//--------------
//    @Bean
//    public Docket createRestApi(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.lsgf.springboot08swagger.controller"))
//                .paths(PathSelectors.any())
//                .build()
//                .securityContexts(securityContext())
//                .securitySchemes(securitySchemes());
//    }

//
//    private ApiInfo apiInfo(){
//        return new ApiInfoBuilder()
//                .title("文本文档")
//                .description("文本文档")
//                .contact(new Contact("XXXX","http:localhost:8080/doc.html","xxx@xxx.com"))
//                .version("1.0")
//                .build();
//    }
//
//    private List<ApiKey> securitySchemes(){
//        //设置请求头信息的, Swagger 测试用的
//        List<ApiKey> result = new ArrayList<>();
//        ApiKey apiKey = new ApiKey("Authorization","Authorization","Header");
//        result.add(apiKey);
//        return result;
//    }
//    private List<SecurityContext> securityContext(){
//        //设置请求头信息的, Swagger 测试用的
//        List<SecurityContext> result = new ArrayList<>();
//        result.add(getContextByPath("/hello/.*"));
//        return result;
//    }
//
//    private SecurityContext getContextByPath(String pathRegex) {
//        return SecurityContext.builder()
//                .securityReferences(defaultAuth())
//                .forPaths(PathSelectors.regex(pathRegex))
//                .build();
//    }
//
//    private List<SecurityReference> defaultAuth() {
//        List<SecurityReference> result = new ArrayList<>();
//        AuthorizationScope authorizationScope = new AuthorizationScope("global","accessEverything");
//        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
//        authorizationScopes[0] = authorizationScope;
//        result.add(new SecurityReference("Authorization",authorizationScopes));
//        return result;
//    }
}
