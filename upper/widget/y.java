package com.bilibili.upper.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/y.class */
public final class y extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutlineRoundRectFrameLayout f114706a;

    public y(OutlineRoundRectFrameLayout outlineRoundRectFrameLayout) {
        this.f114706a = outlineRoundRectFrameLayout;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, (int) (view.getWidth() + this.f114706a.f114401a), view.getHeight(), this.f114706a.f114401a);
    }
}
