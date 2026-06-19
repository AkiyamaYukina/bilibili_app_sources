package com.bilibili.lib.ui;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/FragmentContainerConfig.class */
@java.lang.annotation.Target({ElementType.TYPE})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
public @interface FragmentContainerConfig {
    int largeScreen() default 1;

    int mediumScreen() default 1;

    boolean selfHandleOrientation() default false;

    int smallScreen() default 1;
}
