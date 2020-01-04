package com.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-hi1")
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi1", method = RequestMethod.GET)
    String sayHiFromClientOne();
}
