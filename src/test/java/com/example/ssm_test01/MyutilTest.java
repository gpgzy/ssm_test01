package com.example.ssm_test01;

import com.example.ssm_test01.utils.MyUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class MyutilTest {
    @Test
    @DisplayName("add,hhhh")
    public void test_add(){
        Assertions.assertEquals(3, MyUtil.add(1,1));
    }
}
