package com.bilibili.upper.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/B.class */
public final class B extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f114302a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f114302a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                break;
            default:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), Math.min(view.getWidth(), view.getHeight()) / 2.0f);
                break;
        }
    }
}
