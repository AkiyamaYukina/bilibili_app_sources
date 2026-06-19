package com.bilibili.search2.stardust.expose;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/expose/h.class */
@StabilityInferred(parameters = 0)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Rect f88758a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Rect f88759b = new Rect();

    public static void a(View view, Rect rect) {
        View view2 = (View) view.getParent();
        rect.set(RangesKt.coerceAtLeast(view.getLeft(), 0), RangesKt.coerceAtLeast(view.getTop(), 0), RangesKt.coerceAtMost(view.getRight(), view2.getWidth()), RangesKt.coerceAtMost(view.getBottom(), view2.getHeight()));
    }
}
