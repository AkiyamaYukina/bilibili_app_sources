package com.bilibili.ship.theseus.playlist.di.playlist;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.playlist.api.PlaylistInfo;
import dagger.Module;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/playlist/a.class */
@StabilityInferred(parameters = 0)
@Module
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PlaylistInfo f95742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<MultiTypeMedia> f95743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f95744c;

    public a(@NotNull PlaylistInfo playlistInfo, @NotNull List<MultiTypeMedia> list, boolean z6) {
        this.f95742a = playlistInfo;
        this.f95743b = list;
        this.f95744c = z6;
    }
}
