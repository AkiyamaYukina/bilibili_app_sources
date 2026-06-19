package com.bilibili.okretro.interceptor;

import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/interceptor/SignOnUrlRequestInterceptor.class */
public class SignOnUrlRequestInterceptor extends DefaultRequestInterceptor {
    @Override // com.bilibili.okretro.interceptor.DefaultRequestInterceptor
    public final void addCommonParamToBody(HttpUrl httpUrl, RequestBody requestBody, Request.Builder builder) {
    }

    @Override // com.bilibili.okretro.interceptor.DefaultRequestInterceptor, com.bilibili.okretro.interceptor.IRequestInterceptor
    public final Request intercept(Request request) {
        Request.Builder builderNewBuilder = request.newBuilder();
        addHeader(builderNewBuilder);
        addCommonParamToUrl(request.url(), builderNewBuilder);
        return builderNewBuilder.build();
    }
}
