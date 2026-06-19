package com.bilibili.ogv.bdesign.tab;

import androidx.compose.foundation.ScrollState;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bdesign/tab/d.class */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ScrollState f67426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f67427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f67428c;

    public d(@NotNull ScrollState scrollState, @NotNull CoroutineScope coroutineScope) {
        this.f67426a = scrollState;
        this.f67427b = coroutineScope;
    }
}
