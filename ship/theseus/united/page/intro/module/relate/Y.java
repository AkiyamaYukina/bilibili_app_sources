package com.bilibili.ship.theseus.united.page.intro.module.relate;

import android.graphics.Rect;
import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/Y.class */
public final class Y {
    @NotNull
    public static final Rect a(@NotNull View view) {
        Rect rectA = Fp.c.a(view);
        int i7 = rectA.left;
        rectA.set((view.getPaddingLeft() + i7) - Uj0.c.b(4, view.getContext()), view.getPaddingTop() + rectA.top, rectA.right - view.getPaddingRight(), rectA.bottom - view.getPaddingBottom());
        return rectA;
    }
}
