package com.bilibili.biligame.api.call.disaster;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/call/disaster/NewDisaster.class */
@Target({ElementType.METHOD})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
public @interface NewDisaster {
    int[] excludeCode() default {};

    String method() default "GET";

    String[] queryKey() default {""};

    String[] queryValue() default {""};

    String url();
}
