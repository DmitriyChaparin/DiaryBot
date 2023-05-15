package com.example.dedbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DedBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(DedBotApplication.class, args);
    }

}
