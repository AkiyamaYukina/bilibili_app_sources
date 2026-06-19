package com.bilibili.okretro.anno;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/anno/Timeout.class */
@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Timeout {
    public static final long IGNORE = -1;

    long conn() default -1;

    long read() default -1;

    long write() default -1;
}
