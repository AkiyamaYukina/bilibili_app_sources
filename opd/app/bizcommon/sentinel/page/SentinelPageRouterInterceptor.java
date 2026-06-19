package com.bilibili.opd.app.bizcommon.sentinel.page;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.bilibili.opd.app.bizcommon.context.PageRouterInterceptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/sentinel/page/SentinelPageRouterInterceptor.class */
public class SentinelPageRouterInterceptor implements PageRouterInterceptor {
    @Override // com.bilibili.opd.app.bizcommon.context.PageRouterInterceptor
    public boolean preHandle(Intent intent, int i7, Context context) {
        if (intent == null) {
            return false;
        }
        intent.putExtra(PageDetector.PAGE_START_KEY, String.valueOf(SystemClock.elapsedRealtime()));
        intent.putExtra(PageDetector.PAGE_START_KEY_2, String.valueOf(System.currentTimeMillis()));
        return false;
    }
}
