package com.bilibili.playerbizcommonv2.web;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/v.class */
public final class v {
    public static final void a(float f7, @NotNull List list, boolean z6) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (z6) {
                view.setTranslationX(f7);
                view.setTranslationY(0.0f);
            } else {
                view.setTranslationX(0.0f);
                view.setTranslationY(f7);
            }
        }
    }
}
