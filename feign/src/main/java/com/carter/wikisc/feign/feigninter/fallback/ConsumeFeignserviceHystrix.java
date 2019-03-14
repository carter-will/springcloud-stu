package com.carter.wikisc.feign.feigninter.fallback;

import com.carter.wikisc.feign.feigninter.ConsumeFeignService;
import org.springframework.stereotype.Component;

@Component
public class ConsumeFeignserviceHystrix implements ConsumeFeignService {

    @Override
    public String hi(String name) {
        return "fallback " + name;
    }
}
