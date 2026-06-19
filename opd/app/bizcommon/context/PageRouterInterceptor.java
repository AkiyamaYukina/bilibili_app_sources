package com.bilibili.opd.app.bizcommon.context;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/PageRouterInterceptor.class */
public interface PageRouterInterceptor {
    boolean preHandle(Intent intent, int i7, Context context);
}
