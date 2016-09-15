package com.secapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SecappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecappApplication.class, args);
    }
}
