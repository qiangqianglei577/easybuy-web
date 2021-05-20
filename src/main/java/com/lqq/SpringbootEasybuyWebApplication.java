package com.lqq;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@EnableSwagger2Doc
@MapperScan("com.lqq.mapper")
public class SpringbootEasybuyWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEasybuyWebApplication.class, args);
    }
}
