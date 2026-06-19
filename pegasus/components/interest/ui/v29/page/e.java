package com.bilibili.pegasus.components.interest.ui.v29.page;

import android.view.View;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v29/page/e.class */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f76545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterestChoose f76546b;

    public e(View view, InterestChoose interestChoose) {
        this.f76545a = view;
        this.f76546b = interestChoose;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bilibili.pegasus.components.interest.e.r(this.f76546b.D(), this.f76546b.O());
    }
}
