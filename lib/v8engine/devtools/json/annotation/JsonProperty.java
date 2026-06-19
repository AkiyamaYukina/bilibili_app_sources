package com.bilibili.lib.v8engine.devtools.json.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8engine/devtools/json/annotation/JsonProperty.class */
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonProperty {
    int order() default -1;

    boolean required() default false;
}
