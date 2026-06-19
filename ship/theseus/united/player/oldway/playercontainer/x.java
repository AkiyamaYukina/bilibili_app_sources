package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlinx.coroutines.flow.MutableStateFlow;
import tv.danmaku.biliplayerv2.PlayerContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/x.class */
public final class x implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlayerContainer f104783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableStateFlow<Boolean> f104784b;

    public x(PlayerContainer playerContainer, MutableStateFlow<Boolean> mutableStateFlow) {
        this.f104783a = playerContainer;
        this.f104784b = mutableStateFlow;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.f104784b.setValue(Boolean.FALSE);
        this.f104783a.onDestroy();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        this.f104783a.onPause();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        this.f104783a.onResume();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        this.f104783a.onStart();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        this.f104783a.onStop();
    }
}
