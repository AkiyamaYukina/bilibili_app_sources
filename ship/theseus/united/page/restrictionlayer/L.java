package com.bilibili.ship.theseus.united.page.restrictionlayer;

import android.os.CountDownTimer;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/L.class */
public final class L extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f102570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f102571b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(M m7, I i7, long j7, long j8) {
        super(j7, j8);
        this.f102570a = m7;
        this.f102571b = i7;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.f102571b.invoke();
        this.f102570a.f102596x = null;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j7) {
        MutableStateFlow<Duration> mutableStateFlow = this.f102570a.f102597y;
        Duration.Companion companion = Duration.Companion;
        mutableStateFlow.setValue(Duration.box-impl(DurationKt.toDuration(j7, DurationUnit.MILLISECONDS)));
    }
}
