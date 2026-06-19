package com.bilibili.okretro.anno;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/anno/CacheControl.class */
@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheControl {
    int config() default 2;

    long value() default 120000;
}
