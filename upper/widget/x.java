package com.bilibili.upper.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/x.class */
public final class x extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutlineRoundRectFrameLayout f114705a;

    public x(OutlineRoundRectFrameLayout outlineRoundRectFrameLayout) {
        this.f114705a = outlineRoundRectFrameLayout;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, -((int) this.f114705a.f114401a), view.getWidth(), view.getHeight(), this.f114705a.f114401a);
    }
}
