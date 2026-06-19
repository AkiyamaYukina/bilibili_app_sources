package com.bilibili.search2.main.data;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/data/g.class */
public final class g implements LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableLiveData f86816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m<Object> f86817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lifecycle f86818c;

    public g(MutableLiveData mutableLiveData, m mVar, Lifecycle lifecycle) {
        this.f86816a = mutableLiveData;
        this.f86817b = mVar;
        this.f86818c = lifecycle;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void destory() {
        this.f86816a.removeObserver(this.f86817b);
        this.f86818c.removeObserver(this);
    }
}
