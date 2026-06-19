package com.bilibili.playerbizcommonv2.guideBubble;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/guideBubble/d.class */
public final class d implements ViewTreeObserver.OnWindowAttachListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliGuideBubble f81765a;

    public d(BiliGuideBubble biliGuideBubble) {
        this.f81765a = biliGuideBubble;
    }

    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
    public final void onWindowAttached() {
        this.f81765a.a();
    }

    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
    public final void onWindowDetached() {
        this.f81765a.a();
    }
}
