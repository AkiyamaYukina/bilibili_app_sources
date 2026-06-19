package com.bilibili.opd.app.bizcommon.hybridruntime.neul;

import Am0.h;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.bilibili.base.MainThread;
import com.bilibili.lib.spy.generated.android_app_Service;
import com.bilibili.lib.tribe.core.internal.Hooks;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/neul/PreheatService.class */
public final class PreheatService extends android_app_Service {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f73588d = 0;

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(@Nullable Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(@Nullable Intent intent, int i7, int i8) {
        if (intent == null) {
            return super.onStartCommand(intent, i7, i8);
        }
        String action = intent.getAction();
        if (action != null && action.hashCode() == -679505761 && action.equals("action_web_preheat")) {
            MainThread.runOnMainThread(new h(0, intent, this));
        }
        return super.onStartCommand(intent, i7, i8);
    }
}
