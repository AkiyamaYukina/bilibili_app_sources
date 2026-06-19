package com.bilibili.playerbizcommonv2.guideBubble;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/guideBubble/e.class */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f81766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiliGuideBubble f81767b;

    public e(View view, BiliGuideBubble biliGuideBubble) {
        this.f81766a = view;
        this.f81767b = biliGuideBubble;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f81766a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f81767b.a();
    }
}
