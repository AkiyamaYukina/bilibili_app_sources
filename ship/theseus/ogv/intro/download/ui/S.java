package com.bilibili.ship.theseus.ogv.intro.download.ui;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/S.class */
@StabilityInferred(parameters = 0)
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final e0 f92499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final OgvEpisode f92500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C6173l f92501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableState f92502d = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableState f92503e;

    public S(@NotNull e0 e0Var, @NotNull OgvEpisode ogvEpisode, @NotNull C6173l c6173l) {
        this.f92499a = e0Var;
        this.f92500b = ogvEpisode;
        this.f92501c = c6173l;
        this.f92503e = SnapshotStateKt.mutableStateOf$default(e0Var, null, 2, null);
    }
}
