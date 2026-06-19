package com.bilibili.pegasus.components.interest.ui.v35.page;

import android.view.View;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/page/g.class */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f76809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterestChoose f76810b;

    public g(View view, InterestChoose interestChoose) {
        this.f76809a = view;
        this.f76810b = interestChoose;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bilibili.pegasus.components.interest.e.q(this.f76810b.D(), this.f76810b.O(), this.f76810b.B());
    }
}
