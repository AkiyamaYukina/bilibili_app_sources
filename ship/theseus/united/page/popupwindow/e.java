package com.bilibili.ship.theseus.united.page.popupwindow;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/popupwindow/e.class */
public final class e implements ViewTreeObserver.OnWindowAttachListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f102436a;

    public e(g gVar) {
        this.f102436a = gVar;
    }

    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
    public final void onWindowAttached() {
        g gVar = this.f102436a;
        int i7 = g.f102439l;
        gVar.a();
    }

    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
    public final void onWindowDetached() {
        g gVar = this.f102436a;
        int i7 = g.f102439l;
        gVar.a();
    }
}
