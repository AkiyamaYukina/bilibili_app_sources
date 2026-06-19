package com.bilibili.ogv.secondary;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/H.class */
@StabilityInferred(parameters = 1)
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableState f72607a;

    public H(@NotNull String str) {
        this.f72607a = SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
    }
}
