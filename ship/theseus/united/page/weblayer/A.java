package com.bilibili.ship.theseus.united.page.weblayer;

import android.view.ViewTreeObserver;
import dv0.K0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/A.class */
public final class A implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TheseusWebUIComponent f104128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K0 f104129b;

    public A(TheseusWebUIComponent theseusWebUIComponent, K0 k02) {
        this.f104128a = theseusWebUIComponent;
        this.f104129b = k02;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f104128a.h = this.f104129b.f116815i.getMeasuredHeight();
        this.f104129b.f116808a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
