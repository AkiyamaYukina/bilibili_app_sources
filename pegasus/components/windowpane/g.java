package com.bilibili.pegasus.components.windowpane;

import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.pegasus.PegasusDDConfigKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/windowpane/g.class */
public final class g {
    public static final int a(@NotNull WindowSizeClass windowSizeClass) {
        return PegasusDDConfigKt.isWidthLarge(windowSizeClass) ? DimenUtilsKt.dpToPx(34) : PegasusDDConfigKt.isWidthMedium(windowSizeClass) ? DimenUtilsKt.dpToPx(16) : DimenUtilsKt.dpToPx(2.5d);
    }
}
