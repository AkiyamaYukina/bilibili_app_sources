package com.bilibili.playset.widget.favorite;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/a.class */
@Stable
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableState f85736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableState f85737b;

    public a() {
        Boolean bool = Boolean.FALSE;
        this.f85736a = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f85737b = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }
}
