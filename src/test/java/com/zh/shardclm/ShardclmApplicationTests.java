package com.zh.shardclm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShardclmApplicationTests {





    private String ab;

    @Value("${abcd.ef}")
    public void setAb(String a) {
        this.ab = a;
    }

    @Value("${abcd.daigc.ef}")
    private String cd;

    @Test
    void contextLoads() {

        System.out.println(ab);
        System.out.println(cd);

    }

}
