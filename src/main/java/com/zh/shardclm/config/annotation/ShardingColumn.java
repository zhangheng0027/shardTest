package com.zh.shardclm.config.annotation;

import java.lang.annotation.*;

/**
 * 分片字段
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ShardingColumn {
}
