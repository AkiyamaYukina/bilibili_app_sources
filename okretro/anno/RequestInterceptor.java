package com.bilibili.okretro.anno;

import com.bilibili.okretro.interceptor.IRequestInterceptor;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/anno/RequestInterceptor.class */
@Target({ElementType.METHOD, ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestInterceptor {
    Class<? extends IRequestInterceptor> value();
}
