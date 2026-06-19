package com.bilibili.okretro.interceptor;

import okhttp3.Request;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/interceptor/IRequestInterceptor.class */
public interface IRequestInterceptor {
    Request intercept(Request request);
}
