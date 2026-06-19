package com.bilibili.opd.app.bizcommon.context;

import com.bilibili.base.BiliContext;
import com.bilibili.droid.ProcessUtils;
import com.bilibili.opd.app.bizcommon.context.utils.TraceLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/i.class */
public final /* synthetic */ class i implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        TraceLog.i("MallActivityLifecycle init isMainProcess: " + ProcessUtils.isMainProcess());
        j jVar = j.f73544a;
        BiliContext.unregisterActivityStateCallback(jVar);
        BiliContext.registerActivityStateCallback(jVar);
    }
}
