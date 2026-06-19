package com.bilibili.playset.widget.favorite;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/n.class */
@Stable
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableState f85771a = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableFloatState f85772b = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableFloatState f85773c = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
}
