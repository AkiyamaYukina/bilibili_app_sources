package com.bilibili.preload;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.bilibili.lib.spy.generated.android_app_Service;
import com.bilibili.lib.tribe.core.internal.Hooks;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/preload/WebViewPreloadService.class */
public final class WebViewPreloadService extends android_app_Service {
    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // android.app.Service
    public final /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0277  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int onStartCommand(@org.jetbrains.annotations.Nullable android.content.Intent r7, int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 799
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.preload.WebViewPreloadService.onStartCommand(android.content.Intent, int, int):int");
    }
}
