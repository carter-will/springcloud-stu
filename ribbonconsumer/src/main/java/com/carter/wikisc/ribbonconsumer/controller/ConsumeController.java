package com.carter.wikisc.ribbonconsumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumeController {

    @Autowired
    RestTemplate restTemplate;


    /**
     * 通过ribbon进行了客户端负载均衡，会随机访问到 8082  或 8083
     * @param name
     * @return
     */
    @RequestMapping("/")
    @HystrixCommand(fallbackMethod = "hiFallback")
    public String hi(String name){
        //这里直接写的是服务名： springcloud-eureka-serviceprovider  。在ribbon中它会根据服务名来选择具体的服务实例，根据服务实例在请求的时候会用具体的url替换掉服务名
        return restTemplate.getForObject("http://serviceprovider1?name=" + name, String.class);
    }

    //hiFallBack的方法声明要与上面hi的声明一致
    public String hiFallback(String name){
        return "fallback " + name;
    }

}
