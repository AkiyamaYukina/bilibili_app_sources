package com.bilibili.ship.theseus.ogv.intro.download.ui;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/d0.class */
@StabilityInferred(parameters = 0)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f92543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DownloadItemStyle f92544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final c0 f92545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList<S> f92546d = SnapshotStateKt.mutableStateListOf();

    public d0(@NotNull String str, @NotNull DownloadItemStyle downloadItemStyle, @Nullable c0 c0Var) {
        this.f92543a = str;
        this.f92544b = downloadItemStyle;
        this.f92545c = c0Var;
    }
}
