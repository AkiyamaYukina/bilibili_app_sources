package com.bilibili.pegasus.fakepegasus;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Set;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/fakepegasus/d.class */
public final class d implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentActivity f77447a;

    public d(FragmentActivity fragmentActivity) {
        this.f77447a = fragmentActivity;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            ((Set) e.f77448a.getValue()).remove(this.f77447a);
        }
    }
}
