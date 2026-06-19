package com.bilibili.ship.theseus.united.page.popupwindow;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/popupwindow/f.class */
public final class f implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f102437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f102438b;

    public f(View view, g gVar) {
        this.f102437a = view;
        this.f102438b = gVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f102437a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        g gVar = this.f102438b;
        this.f102437a.getWidth();
        int i7 = g.f102439l;
        gVar.getClass();
        g gVar2 = this.f102438b;
        this.f102437a.getHeight();
        gVar2.getClass();
        this.f102438b.a();
    }
}
