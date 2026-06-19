package com.bilibili.pegasus.components.interest.ui.v33.page;

import android.view.View;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/page/f.class */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f76729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterestChoose f76730b;

    public f(View view, InterestChoose interestChoose) {
        this.f76729a = view;
        this.f76730b = interestChoose;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bilibili.pegasus.components.interest.e.r(this.f76730b.D(), this.f76730b.O());
    }
}
