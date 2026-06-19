package com.bilibili.ogv.bpf.lifecycle;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bpf/lifecycle/d.class */
public final class d implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f67497a;

    public d(e eVar) {
        this.f67497a = eVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.f67497a.f67498a.setValue((Object) null);
    }
}
