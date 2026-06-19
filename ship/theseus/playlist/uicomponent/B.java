package com.bilibili.ship.theseus.playlist.uicomponent;

import android.os.CountDownTimer;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/B.class */
public final class B extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f95921a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(z zVar, long j7) {
        super(j7, 1000L);
        this.f95921a = zVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.f95921a.f96111d.invoke();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j7) {
        Object value;
        MutableStateFlow<Integer> mutableStateFlow = this.f95921a.f96112e;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, Integer.valueOf(((Number) value).intValue() - 1)));
    }
}
