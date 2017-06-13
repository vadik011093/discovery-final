package ru.mipt.master;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(name = "server")
public interface HelloClient {

    @RequestMapping(method = GET)
    String requestHello(@RequestParam("name") String name);

}
