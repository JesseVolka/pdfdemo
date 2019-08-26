package com.example.pdfdemo;

import cn.hutool.core.date.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PdfdemoApplicationTests {

    @Test
    public void contextLoads() {
        final Person fan=new Person();
        fan.setName("fan");
        System.out.println(fan);
    }

}
