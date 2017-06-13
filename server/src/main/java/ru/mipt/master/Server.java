package ru.mipt.master;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class Server {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Server.class).run(args);
    }

    @RequestMapping
    public String hello(@RequestParam(required = false) String name) {
        String result = Optional.ofNullable(name).orElseGet(() -> "World");
        return String.format("Hello, %s!", result);
    }

}