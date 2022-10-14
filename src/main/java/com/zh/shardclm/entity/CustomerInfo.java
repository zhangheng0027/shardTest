package com.zh.shardclm.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.zh.shardclm.config.annotation.ShardTable;
import com.zh.shardclm.config.annotation.ShardingColumn;

@ShardTable
@TableName
public class CustomerInfo {

    @ShardingColumn
    private String ShardingColumn;

}
