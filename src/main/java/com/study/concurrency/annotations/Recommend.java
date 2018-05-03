package com.study.concurrency.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用来标记【推荐】的类或者写法
 */
@Target(ElementType.TYPE)   // 指定哪些是线程安全 哪些不是
@Retention(RetentionPolicy.SOURCE)   // 注解存在的范围
public @interface Recommend {

    String value() default "";

}