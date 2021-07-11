package com.example.mymalltest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mymalltest.mapper")
public class MymalltestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymalltestApplication.class, args);
    }

}
