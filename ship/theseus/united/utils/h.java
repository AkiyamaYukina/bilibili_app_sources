package com.bilibili.ship.theseus.united.utils;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.core.graphics.drawable.DrawableCompat;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/h.class */
public final class h {
    @NotNull
    public static final Drawable a(@ColorInt int i7, @NotNull Drawable drawable) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        Drawable drawableWrap = DrawableCompat.wrap(drawable);
        drawableWrap.mutate();
        DrawableCompat.setTint(drawableWrap, i7);
        DrawableCompat.setTintMode(drawableWrap, mode);
        return drawableWrap;
    }
}
