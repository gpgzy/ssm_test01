package com.example.ssm_test01;

import com.example.ssm_test01.service.PersonService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

class SsmTest01ApplicationTests {
Logger logger = LoggerFactory.getLogger(PersonService.class);
    @Test
    void contextLoads() {
    }

}
