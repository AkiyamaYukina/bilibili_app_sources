package com.bilibili.ship.theseus.playlist.api;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/Meta.class */
@StabilityInferred(parameters = 1)
@Bson
public final class Meta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f95211b;

    public Meta() {
        this(0, 0L, 3);
    }

    public Meta(int i7, long j7, int i8) {
        i7 = (i8 & 1) != 0 ? 0 : i7;
        j7 = (i8 & 2) != 0 ? 0L : j7;
        this.f95210a = i7;
        this.f95211b = j7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Meta)) {
            return false;
        }
        Meta meta = (Meta) obj;
        return this.f95210a == meta.f95210a && this.f95211b == meta.f95211b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f95211b) + (Integer.hashCode(this.f95210a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Meta(quality=");
        sb.append(this.f95210a);
        sb.append(", size=");
        return a.a(sb, this.f95211b, ")");
    }
}
