package com.bilibili.lib.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/P.class */
public final class P {
    @Nullable
    public static View a(@Nullable View view, @NonNull Class cls) {
        if (view == null) {
            return null;
        }
        int id = view.getId();
        if (id != -1 && cls.isInstance(view)) {
            try {
                if ("nav_top_bar".equals(view.getResources().getResourceEntryName(id))) {
                    return (View) cls.cast(view);
                }
            } catch (Resources.NotFoundException e7) {
            }
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
            View viewA = a(viewGroup.getChildAt(i7), cls);
            if (viewA != null) {
                return viewA;
            }
        }
        return null;
    }
}
