package com.bilibili.ship.theseus.ogv.intro.download.ui;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.intro.download.bean.OgvEpisodeReserve;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/c0.class */
@StabilityInferred(parameters = 0)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OgvEpisodeReserve f92538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final OgvEpisode f92539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final DownloadItemStyle f92540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C6177p f92541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableState f92542e;

    public c0(@NotNull OgvEpisodeReserve ogvEpisodeReserve, @NotNull OgvEpisode ogvEpisode, @NotNull DownloadItemStyle downloadItemStyle, @NotNull C6177p c6177p) {
        this.f92538a = ogvEpisodeReserve;
        this.f92539b = ogvEpisode;
        this.f92540c = downloadItemStyle;
        this.f92541d = c6177p;
        this.f92542e = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(ogvEpisode.f93552H != 1 ? false : true), null, 2, null);
    }
}
