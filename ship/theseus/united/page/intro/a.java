package com.bilibili.ship.theseus.united.page.intro;

import androidx.window.core.layout.WindowSizeClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/a.class */
public final class a {
    public static final int a(@NotNull WindowSizeClass windowSizeClass, boolean z6, int i7) {
        int i8 = i7;
        if (!com.bilibili.ship.theseus.united.page.screensize.b.d(windowSizeClass)) {
            if (z6) {
                i8 = i7;
            } else {
                int minWidthDp = windowSizeClass.getMinWidthDp();
                if (600 > minWidthDp || minWidthDp >= 840) {
                    i8 = i7;
                    if (840 <= minWidthDp) {
                        i8 = i7;
                        if (minWidthDp <= Integer.MAX_VALUE) {
                            i8 = 40;
                        }
                    }
                } else {
                    i8 = 20;
                }
            }
        }
        return i8;
    }

    public static final int b(@NotNull WindowSizeClass windowSizeClass) {
        return ((!s71.a.a || com.bilibili.ship.theseus.united.page.screensize.b.d(windowSizeClass)) && !(s71.a.b && com.bilibili.ship.theseus.united.page.screensize.b.c(windowSizeClass))) ? 0 : 480;
    }
}
