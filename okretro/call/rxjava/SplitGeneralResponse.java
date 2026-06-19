package com.bilibili.okretro.call.rxjava;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/rxjava/SplitGeneralResponse.class */
@Target({ElementType.METHOD})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
public @interface SplitGeneralResponse {
    boolean parse4XX() default true;

    boolean strict() default true;
}
