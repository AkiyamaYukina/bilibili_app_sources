package com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/O.class */
public final class O implements DisposableEffectResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lifecycle f102811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f102812b;

    public O(Lifecycle lifecycle, I i7) {
        this.f102811a = lifecycle;
        this.f102812b = i7;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f102811a.removeObserver(this.f102812b);
    }
}
