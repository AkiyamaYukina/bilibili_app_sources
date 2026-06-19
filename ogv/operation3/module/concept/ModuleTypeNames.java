package com.bilibili.ogv.operation3.module.concept;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationTarget;
import kotlinx.serialization.SerialInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/concept/ModuleTypeNames.class */
@Target({ElementType.TYPE})
@SerialInfo
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
public @interface ModuleTypeNames {
    String[] names();
}
