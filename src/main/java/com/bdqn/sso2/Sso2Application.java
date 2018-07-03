package com.bdqn.sso2;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.bdqn.sso2.dao"})
public class Sso2Application {

    public static void main(String[] args) {
        SpringApplication.run(Sso2Application.class, args);
    }
}
