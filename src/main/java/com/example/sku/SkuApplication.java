package com.example.sku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableCaching
public class SkuApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkuApplication.class, args);
        System.out.println("------------------start-------------------");
    }

}
