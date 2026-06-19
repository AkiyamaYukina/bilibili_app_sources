package com.bilibili.okretro.converter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import retrofit2.Converter;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/converter/RetrofitResponseConverterFactory.class */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface RetrofitResponseConverterFactory {
    Class<? extends Converter.Factory> value();
}
