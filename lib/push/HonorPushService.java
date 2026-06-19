package com.bilibili.lib.push;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.hihonor.push.sdk.HonorMessageService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/HonorPushService.class */
public class HonorPushService extends HonorMessageService {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f64219e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f64220d = new Handler(Looper.getMainLooper());

    /* JADX WARN: Multi-variable type inference failed */
    public final void attachBaseContext(Context context) {
        super/*android.app.Service*/.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    public final void onNewToken(String str) {
        BPushLog.i("HonorPushService", "onNewToken called");
        this.f64220d.post(new Qh1.F(str, 1));
    }
}
