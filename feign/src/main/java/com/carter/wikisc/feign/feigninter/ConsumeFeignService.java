package com.carter.wikisc.feign.feigninter;

import com.carter.wikisc.feign.feigninter.fallback.ConsumeFeignserviceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "serviceprovider1",fallback = ConsumeFeignserviceHystrix.class)
public interface ConsumeFeignService {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String hi(@RequestParam(value = "name") String name);
}
