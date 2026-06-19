package com.bilibili.ship.theseus.united.page.videoquality;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/M.class */
public final class M implements DefaultLifecycleObserver {
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        int i7 = K.f103727b + 1;
        K.f103727b = i7;
        if (i7 <= 0) {
            K.f103728c = null;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        int i7 = K.f103727b - 1;
        K.f103727b = i7;
        if (i7 <= 0) {
            K.f103728c = null;
        }
    }
}
