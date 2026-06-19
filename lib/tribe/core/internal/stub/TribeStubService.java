package com.bilibili.lib.tribe.core.internal.stub;

import Lf0.RunnableC2536b;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import com.bilibili.lib.spy.generated.android_app_Service;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal/stub/TribeStubService.class */
public final class TribeStubService extends android_app_Service {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f64657d = 0;

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(@NotNull Intent intent) {
        return null;
    }

    @Override // com.bilibili.lib.spy.generated.android_app_Service, android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.w("TribeStub", "stub service");
    }

    @Override // android.app.Service
    public final int onStartCommand(@Nullable Intent intent, int i7, int i8) {
        new Handler().postDelayed(new RunnableC2536b(this), 1000L);
        return 2;
    }
}
