package com.bilibili.pegasus.components.interest;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kp0.C7782e;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/y.class */
public final class y implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NewUserInterestChoosePlugin f76989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C7782e f76990b;

    public y(NewUserInterestChoosePlugin newUserInterestChoosePlugin, C7782e c7782e) {
        this.f76989a = newUserInterestChoosePlugin;
        this.f76990b = c7782e;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Lifecycle.Event event2 = Lifecycle.Event.ON_START;
        NewUserInterestChoosePlugin newUserInterestChoosePlugin = this.f76989a;
        if (event == event2) {
            newUserInterestChoosePlugin.e(this.f76990b.b());
        }
        if (event == event2 || event == Lifecycle.Event.ON_DESTROY) {
            newUserInterestChoosePlugin.getRequireFragment().getLifecycle().removeObserver(this);
        }
    }
}
