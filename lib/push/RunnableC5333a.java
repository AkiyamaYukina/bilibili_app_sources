package com.bilibili.lib.push;

import Ue0.C2900a;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.xiaomi.mipush.sdk.NotificationClickedActivity;

/* JADX INFO: renamed from: com.bilibili.lib.push.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/a.class */
public final class RunnableC5333a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64234a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f64235b;

    public RunnableC5333a(Context context) {
        this.f64235b = context;
    }

    public RunnableC5333a(NotificationClickedActivity notificationClickedActivity) {
        this.f64235b = notificationClickedActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f64234a) {
            case 0:
                ProcessLifecycleOwner.get().getLifecycle().addObserver(new C2900a((Context) this.f64235b));
                break;
            default:
                aW0.b.r("clicked activity finish by timeout.");
                ((NotificationClickedActivity) this.f64235b).finish();
                break;
        }
    }
}
