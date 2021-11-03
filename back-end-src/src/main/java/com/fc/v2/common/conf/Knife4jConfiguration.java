package com.fc.v2.common.conf;

import com.fasterxml.classmate.TypeResolver;
import com.fc.v2.common.domain.AjaxResult;
import com.fc.v2.iotmanage.model.respone.SpaceTerminalInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@Configuration
@EnableSwagger2WebMvc
public class Knife4jConfiguration {
	@Autowired
	private V2Config v2Config;

    // 定义分隔符,配置Swagger多包
    private static final String splitor = ";";

    @Autowired
    TypeResolver typeResolver;
    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
    	Contact contact=new Contact("demo-pure","test", "2758385252@qq.com");
        Docket docket=new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("springboot框架的脚手架")
                        .description("springboot框架的脚手架")
                        //服务条款Url
                        .termsOfServiceUrl("null")
                        .contact(contact)
                        .version(v2Config.getVersion())
                        .build())
                //分组名称
                .groupName("demo-pure")
                .select()
                //这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.fc.v2.iotmanage.controller"))
                //.apis(RequestHandlerSelectors.basePackage("com.fc.v2.controller"))
                .paths(PathSelectors.any())
                .build()
                .additionalModels(typeResolver.resolve(SpaceTerminalInfo.class))
                .additionalModels(typeResolver.resolve(AjaxResult.class))
                ;
        return docket;
    }
}
