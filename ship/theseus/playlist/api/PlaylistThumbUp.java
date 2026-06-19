package com.bilibili.ship.theseus.playlist.api;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/PlaylistThumbUp.class */
@StabilityInferred(parameters = 1)
@Bson
public final class PlaylistThumbUp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f95288c;

    public PlaylistThumbUp() {
        this(0, 0, 0, 7);
    }

    public PlaylistThumbUp(int i7, int i8, int i9, int i10) {
        i7 = (i10 & 1) != 0 ? 0 : i7;
        i8 = (i10 & 2) != 0 ? 0 : i8;
        i9 = (i10 & 4) != 0 ? 0 : i9;
        this.f95286a = i7;
        this.f95287b = i8;
        this.f95288c = i9;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaylistThumbUp)) {
            return false;
        }
        PlaylistThumbUp playlistThumbUp = (PlaylistThumbUp) obj;
        return this.f95286a == playlistThumbUp.f95286a && this.f95287b == playlistThumbUp.f95287b && this.f95288c == playlistThumbUp.f95288c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f95288c) + I.a(this.f95287b, Integer.hashCode(this.f95286a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistThumbUp(likes=");
        sb.append(this.f95286a);
        sb.append(", dislikes=");
        sb.append(this.f95287b);
        sb.append(", likeState=");
        return C4277b.a(this.f95288c, ")", sb);
    }
}
