package com.bilibili.ship.theseus.playlist.di.page;

import com.bilibili.app.comm.restrict.RestrictedMode;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.page.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/j.class */
public final class C6227j implements RestrictedMode.OnStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableStateFlow<Boolean> f95704a;

    public C6227j(MutableStateFlow<Boolean> mutableStateFlow) {
        this.f95704a = mutableStateFlow;
    }

    public final void onChanged(boolean z6) {
        this.f95704a.setValue(Boolean.valueOf(z6));
    }
}
