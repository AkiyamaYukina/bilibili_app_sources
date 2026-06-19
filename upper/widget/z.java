package com.bilibili.upper.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/z.class */
public final class z extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutlineRoundRectFrameLayout f114707a;

    public z(OutlineRoundRectFrameLayout outlineRoundRectFrameLayout) {
        this.f114707a = outlineRoundRectFrameLayout;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(-((int) this.f114707a.f114401a), 0, view.getWidth(), view.getHeight(), this.f114707a.f114401a);
    }
}
