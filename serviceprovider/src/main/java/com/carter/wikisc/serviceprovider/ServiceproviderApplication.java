package com.carter.wikisc.serviceprovider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceproviderApplication.class, args);
    }


    @Value("${server.port}")
    String port;

    @RequestMapping("/")
    public String hi(String name) {
        return String.format("hello %s , from port=%s", name, port);
    }


}
