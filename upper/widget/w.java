package com.bilibili.upper.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/w.class */
public final class w extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutlineRoundRectFrameLayout f114704a;

    public w(OutlineRoundRectFrameLayout outlineRoundRectFrameLayout) {
        this.f114704a = outlineRoundRectFrameLayout;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        float height = view.getHeight();
        float f7 = this.f114704a.f114401a;
        outline.setRoundRect(0, 0, width, (int) (height + f7), f7);
    }
}
