package com.bilibili.pegasus.components.interest.ui.v37.page;

import android.view.View;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/k.class */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f76897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterestChoose f76898b;

    public k(View view, InterestChoose interestChoose) {
        this.f76897a = view;
        this.f76898b = interestChoose;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bilibili.pegasus.components.interest.e.q(this.f76898b.D(), this.f76898b.O(), this.f76898b.B());
    }
}
