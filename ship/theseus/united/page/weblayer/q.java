package com.bilibili.ship.theseus.united.page.weblayer;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/q.class */
public final class q extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f104293a;

    public q(float f7) {
        this.f104293a = f7;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int height = view.getHeight();
        float f7 = this.f104293a;
        outline.setRoundRect(0, 0, width, height + ((int) f7), f7);
    }
}
