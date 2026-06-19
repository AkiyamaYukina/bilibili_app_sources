package com.bilibili.pegasus.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/compose/i.class */
@StabilityInferred(parameters = 1)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Rect f77275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f77276b;

    public i(@NotNull Rect rect, @NotNull Rect rect2) {
        this.f77275a = rect;
        this.f77276b = ((rect.getBottom() - rect.getTop()) / (rect2.getBottom() - rect2.getTop())) * ((rect.getRight() - rect.getLeft()) / (rect2.getRight() - rect2.getLeft()));
    }
}
