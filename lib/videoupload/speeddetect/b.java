package com.bilibili.lib.videoupload.speeddetect;

import com.bilibili.okretro.interceptor.SignOnUrlRequestInterceptor;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/speeddetect/b.class */
public final /* synthetic */ class b implements Interceptor {
    public final Response intercept(Interceptor.Chain chain) {
        return chain.proceed(new SignOnUrlRequestInterceptor().intercept(chain.request()));
    }
}
