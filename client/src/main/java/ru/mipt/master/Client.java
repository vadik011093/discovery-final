package ru.mipt.master;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class Client {

    @Autowired
    private final HelloClient helloClient;

    public static void main(String[] args) {
        new SpringApplicationBuilder(Client.class)
                .web(false)
                .run(args);
    }

    @Scheduled(fixedRate = 1000)
    public void hello() {
        System.out.println(helloClient.requestHello("Vadim"));
    }

}
