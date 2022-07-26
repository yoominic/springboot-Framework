package com.main.java;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.main.java.mapper")
public class ZnjtApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZnjtApplication.class, args);
    }

}
