package com.bilibili.upper.module.uppercenter.openscreen;

import android.os.CountDownTimer;
import com.bilibili.upper.module.uppercenter.openscreen.CountDownView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/openscreen/a.class */
public final class a extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownView f114127a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CountDownView countDownView) {
        super(3050L, 1000L);
        this.f114127a = countDownView;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        CountDownView.a countDownListener = this.f114127a.getCountDownListener();
        if (countDownListener != null) {
            countDownListener.onFinish();
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j7) {
        this.f114127a.getTimeText().setText(String.valueOf(j7 / ((long) 1000)));
        this.f114127a.getCountDownListener();
    }
}
