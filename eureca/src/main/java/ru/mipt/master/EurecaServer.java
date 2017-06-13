package ru.mipt.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurecaServer {

    public static void main(String[] args) {
        SpringApplication.run(EurecaServer.class, args);
    }

}
