package com.bilibili.upper.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/A.class */
public final class A extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutlineRoundRectFrameLayout f114301a;

    public A(OutlineRoundRectFrameLayout outlineRoundRectFrameLayout) {
        this.f114301a = outlineRoundRectFrameLayout;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f114301a.f114401a);
    }
}
