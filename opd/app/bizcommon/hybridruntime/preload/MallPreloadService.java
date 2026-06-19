package com.bilibili.opd.app.bizcommon.hybridruntime.preload;

import Bm0.C1437a;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.bilibili.lib.spy.generated.android_app_Service;
import com.bilibili.lib.tribe.core.internal.Hooks;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/preload/MallPreloadService.class */
public final class MallPreloadService extends android_app_Service {
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
        String action;
        String stringExtra;
        if (intent == null || (action = intent.getAction()) == null) {
            return 0;
        }
        int iHashCode = action.hashCode();
        if (iHashCode != -1457105011) {
            if (iHashCode != 1199922598 || !action.equals("action_preload_by_url") || (stringExtra = intent.getStringExtra("extra_url")) == null) {
                return 0;
            }
            C1437a.a(this, stringExtra, 300L);
            return 0;
        }
        if (!action.equals("action_preload_by_urls")) {
            return 0;
        }
        long longExtra = intent.getLongExtra("ttl", 300L);
        String[] stringArrayExtra = intent.getStringArrayExtra("extra_urls");
        if (stringArrayExtra == null) {
            return 0;
        }
        for (String str : stringArrayExtra) {
            C1437a.a(this, str, longExtra);
        }
        return 0;
    }
}
