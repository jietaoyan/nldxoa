package com.fc;

import com.fc.v2.common.conf.FeignConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class,scanBasePackages = "com.fc.v2")
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients(basePackages = {"com.fc.v2.iotmanage.client"},defaultConfiguration = FeignConfig.class)
public class V2Application {

    public static void main(String[] args) {

        SpringApplication.run(V2Application.class, args);

    }

}
