package com.bilibili.search2.eastereggs;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/p.class */
public final class p extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageEggDialog f86524a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ImageEggDialog imageEggDialog, long j7, long j8) {
        super(j7, j8);
        this.f86524a = imageEggDialog;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.f86524a.dismissAllowingStateLoss();
        a aVar = this.f86524a.f86494d;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j7) {
    }
}
