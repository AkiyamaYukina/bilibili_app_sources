package com.bilibili.ogv.infra.android.view;

import android.view.View;
import kotlin.sequences.Sequence;
import kotlin.sequences.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/android/view/ViewTraversalKt.class */
public final class ViewTraversalKt {
    @NotNull
    public static final Sequence<View> a(@NotNull View view) {
        return o.sequence(new ViewTraversalKt$thisAndAncestorViews$1(view, null));
    }

    @NotNull
    public static final Sequence<View> b(@NotNull View view) {
        return o.sequence(new ViewTraversalKt$thisAndDescendants$1(view, null));
    }
}
