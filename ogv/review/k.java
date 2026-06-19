package com.bilibili.ogv.review;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/k.class */
@Stable
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.review.detailpage.c f72446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.review.detailpage.d f72447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableState f72448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableState f72449d;

    public k(@NotNull com.bilibili.ogv.review.detailpage.c cVar, @NotNull com.bilibili.ogv.review.detailpage.d dVar) {
        this.f72446a = cVar;
        this.f72447b = dVar;
        Boolean bool = Boolean.FALSE;
        this.f72448c = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f72449d = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    public final void a(boolean z6) {
        this.f72448c.setValue(Boolean.valueOf(z6));
    }
}
