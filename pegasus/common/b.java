package com.bilibili.pegasus.common;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.pegasus.components.videomode.f;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/b.class */
public final class b implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.a f75516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lifecycle f75517b;

    public b(f.a aVar, Lifecycle lifecycle) {
        this.f75516a = aVar;
        this.f75517b = lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            ((CopyOnWriteArraySet) c.f75518a.getValue()).remove(this.f75516a);
            this.f75517b.removeObserver(this);
        }
    }
}
