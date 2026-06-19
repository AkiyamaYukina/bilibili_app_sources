package com.bilibili.ship.theseus.playlist.api;

import Ou0.a;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/VideoDimension.class */
@StabilityInferred(parameters = 1)
@Bson
public final class VideoDimension {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f95334c;

    public VideoDimension() {
        this(0, 0, 0, 7);
    }

    public VideoDimension(int i7, int i8, int i9) {
        this.f95332a = i7;
        this.f95333b = i8;
        this.f95334c = i9;
    }

    public /* synthetic */ VideoDimension(int i7, int i8, int i9, int i10) {
        this((i10 & 1) != 0 ? a.f18081a.f95332a : i7, (i10 & 2) != 0 ? a.f18081a.f95333b : i8, (i10 & 4) != 0 ? 0 : i9);
    }

    public final float a() {
        float f7;
        float f8;
        int i7 = this.f95334c;
        int i8 = this.f95332a;
        int i9 = this.f95333b;
        if (i7 == 1) {
            int i10 = i9;
            if (i9 == 0) {
                i10 = a.f18081a.f95333b;
            }
            f7 = i10;
            int i11 = i8;
            if (i8 == 0) {
                i11 = a.f18081a.f95332a;
            }
            f8 = i11;
        } else {
            int i12 = i8;
            if (i8 == 0) {
                i12 = a.f18081a.f95332a;
            }
            f7 = i12;
            int i13 = i9;
            if (i9 == 0) {
                i13 = a.f18081a.f95333b;
            }
            f8 = i13;
        }
        return f7 / f8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoDimension)) {
            return false;
        }
        VideoDimension videoDimension = (VideoDimension) obj;
        return this.f95332a == videoDimension.f95332a && this.f95333b == videoDimension.f95333b && this.f95334c == videoDimension.f95334c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f95334c) + I.a(this.f95333b, Integer.hashCode(this.f95332a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoDimension(width=");
        sb.append(this.f95332a);
        sb.append(", height=");
        sb.append(this.f95333b);
        sb.append(", rotate=");
        return C4277b.a(this.f95334c, ")", sb);
    }
}
