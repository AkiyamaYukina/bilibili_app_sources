package com.bilibili.ship.theseus.playlist.di.page;

import com.bilibili.teenagersmode.TeenagersMode;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.page.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/k.class */
public final class C6228k implements TeenagersMode.OnTeenagersModeChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableStateFlow<Boolean> f95705a;

    public C6228k(MutableStateFlow<Boolean> mutableStateFlow) {
        this.f95705a = mutableStateFlow;
    }

    @Override // com.bilibili.teenagersmode.TeenagersMode.OnTeenagersModeChangeListener
    public final void onStateChange(boolean z6, boolean z7) {
        this.f95705a.setValue(Boolean.valueOf(z6));
    }

    @Override // com.bilibili.teenagersmode.TeenagersMode.OnTeenagersModeChangeListener
    public final void onTeenagerModePageShow(boolean z6) {
    }
}
