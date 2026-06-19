package com.bilibili.playerbizcommonv2.web;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/j.class */
public final class j extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f82230a;

    public j(float f7) {
        this.f82230a = f7;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int height = view.getHeight();
        float f7 = this.f82230a;
        outline.setRoundRect(0, 0, width, height + ((int) f7), f7);
    }
}
