package com.bilibili.pegasus.components.interest.ui.v27.page;

import android.view.View;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v27/page/g.class */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f76488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterestChoose f76489b;

    public g(View view, InterestChoose interestChoose) {
        this.f76488a = view;
        this.f76489b = interestChoose;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bilibili.pegasus.components.interest.e.r(this.f76489b.D(), this.f76489b.O());
    }
}
