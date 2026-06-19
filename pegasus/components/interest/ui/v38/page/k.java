package com.bilibili.pegasus.components.interest.ui.v38.page;

import android.view.View;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v38/page/k.class */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f76943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterestChoose f76944b;

    public k(View view, InterestChoose interestChoose) {
        this.f76943a = view;
        this.f76944b = interestChoose;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bilibili.pegasus.components.interest.e.q(this.f76944b.D(), this.f76944b.O(), this.f76944b.B());
    }
}
