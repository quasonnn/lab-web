package com.example.lab_web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.lab_web.mapper")   // 扫描 Mapper 接口
public class LabWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(LabWebApplication.class, args);
    }
}