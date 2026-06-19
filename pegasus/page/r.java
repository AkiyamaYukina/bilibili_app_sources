package com.bilibili.pegasus.page;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/r.class */
public final class r extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5729s f78435a;

    public r(C5729s c5729s) {
        this.f78435a = c5729s;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int height = view.getHeight();
        this.f78435a.getClass();
        outline.setRoundRect(0, 0, width, height, 0.0f);
    }
}
