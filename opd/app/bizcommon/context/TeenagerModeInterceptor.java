package com.bilibili.opd.app.bizcommon.context;

import android.content.Context;
import android.content.Intent;
import com.bilibili.base.BiliContext;
import com.bilibili.teenagersmode.TeenagersMode;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/TeenagerModeInterceptor.class */
public class TeenagerModeInterceptor implements PageRouterInterceptor {
    @Override // com.bilibili.opd.app.bizcommon.context.PageRouterInterceptor
    public boolean preHandle(Intent intent, int i7, Context context) {
        if (intent == null || !TeenagersMode.getInstance().isEnable("mall") || TeenagersMode.getInstance().getInterceptState("mall") != 1) {
            return false;
        }
        TeenagersMode.getInstance().intentToInteceptPage(BiliContext.application());
        return true;
    }
}
