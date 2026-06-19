package com.bilibili.biligame.api.call;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/call/KeySign.class */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface KeySign {
    public static final String UID = "uid";

    String path() default "";

    String[] value() default {""};
}
