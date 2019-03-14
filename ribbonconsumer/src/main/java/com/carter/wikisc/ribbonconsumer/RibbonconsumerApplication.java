package com.carter.wikisc.ribbonconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/**
 * ribbon+restTemplate
 *
 * 如果选用的注册中心是eureka，那么就推荐@EnableEurekaClient，如果是其他的注册中心，那么使用@EnableDiscoveryClient。
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class RibbonconsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonconsumerApplication.class, args);
    }

    /**
     * springcloud中提倡rest风格的微服务
     * 想spring容器中注入RestTemplate
     *
     * 使用LoadBalanced表明这个restRemplate开启负载均衡的功能。
     * @return
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
