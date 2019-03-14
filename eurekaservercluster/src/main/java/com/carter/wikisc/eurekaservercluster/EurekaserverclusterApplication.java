package com.carter.wikisc.eurekaservercluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaserverclusterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaserverclusterApplication.class, args);
    }

}
