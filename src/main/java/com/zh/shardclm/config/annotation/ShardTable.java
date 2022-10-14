package com.zh.shardclm.config.annotation;


import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ShardTable {

    /**
     * 逻辑表名
     * @return
     */
    String logicalTableName() default "";

    /**
     * 真实数据节点, 支持逗号分隔
     * @return
     */
    String dateNode() default "";

    /**
     * 真实数据节点
     * @return
     */
    String[] dateNodes() default {};

    /**
     * 可指定，也可通过 @ShardingColumn 注解在字段上
     * @return
     */
    String shardingColumn() default "";

    String shardingAlgorithmName();


    /**
     * 分片策略
     * standard, complex, inline, hint, none
     * @return
     */
    String type() default "";

}
