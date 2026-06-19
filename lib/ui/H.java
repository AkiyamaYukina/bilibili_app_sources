package com.bilibili.lib.ui;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/H.class */
public final class H implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f64755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lifecycle f64756b;

    public H(F f7, Lifecycle lifecycle) {
        this.f64755a = f7;
        this.f64756b = lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        BLog.d("PermissionRequestUtils", "Lifecycle.Event :: " + event);
        this.f64755a.invoke(event);
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f64756b.removeObserver(this);
        }
    }
}
