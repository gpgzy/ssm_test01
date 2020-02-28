package com.example.ssm_test01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = {"com.example.ssm_test01"})
@ServletComponentScan("com.example.ssm_test01")
@SpringBootApplication
public class SsmTest01Application {

    public static void main(String[] args) {
        SpringApplication.run(SsmTest01Application.class, args);
    }

}
