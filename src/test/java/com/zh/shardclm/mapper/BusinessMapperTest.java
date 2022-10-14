package com.zh.shardclm.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zh.shardclm.entity.BusinessInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class BusinessMapperTest {

    @Autowired
    BusinessMapper businessMapper;

    @Test
    public void test00() {
        QueryWrapper<BusinessInfo> q = new QueryWrapper<>();
        q.eq("customerId", "cu14");
        System.out.println(businessMapper.selectList(q));
    }

}