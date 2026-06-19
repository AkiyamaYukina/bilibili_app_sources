package com.bilibili.pegasus.components.interest.ui.v31.page;

import android.view.View;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v31/page/f.class */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f76616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fo0.h f76617b;

    public f(View view, Fo0.h hVar) {
        this.f76616a = view;
        this.f76617b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Fo0.h hVar = this.f76617b;
        com.bilibili.pegasus.components.interest.e.r(hVar.f6336b, hVar.f6337c);
    }
}
