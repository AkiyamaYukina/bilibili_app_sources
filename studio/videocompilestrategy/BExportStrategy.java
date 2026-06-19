package com.bilibili.studio.videocompilestrategy;

import C.d;
import androidx.compose.animation.core.I;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompilestrategy/BExportStrategy.class */
public final class BExportStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f108797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f108798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f108799c;

    public BExportStrategy(int i7, int i8, float f7) {
        this.f108797a = i7;
        this.f108798b = i8;
        this.f108799c = f7;
    }

    public static /* synthetic */ BExportStrategy copy$default(BExportStrategy bExportStrategy, int i7, int i8, float f7, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = bExportStrategy.f108797a;
        }
        if ((i9 & 2) != 0) {
            i8 = bExportStrategy.f108798b;
        }
        if ((i9 & 4) != 0) {
            f7 = bExportStrategy.f108799c;
        }
        return bExportStrategy.copy(i7, i8, f7);
    }

    public final int component1() {
        return this.f108797a;
    }

    public final int component2() {
        return this.f108798b;
    }

    public final float component3() {
        return this.f108799c;
    }

    @NotNull
    public final BExportStrategy copy(int i7, int i8, float f7) {
        return new BExportStrategy(i7, i8, f7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BExportStrategy)) {
            return false;
        }
        BExportStrategy bExportStrategy = (BExportStrategy) obj;
        return this.f108797a == bExportStrategy.f108797a && this.f108798b == bExportStrategy.f108798b && Float.compare(this.f108799c, bExportStrategy.f108799c) == 0;
    }

    public final float getBitrate() {
        return this.f108799c;
    }

    public final int getFps() {
        return this.f108798b;
    }

    public final int getResolution() {
        return this.f108797a;
    }

    public int hashCode() {
        return Float.hashCode(this.f108799c) + I.a(this.f108798b, Integer.hashCode(this.f108797a) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BExportStrategy(resolution=");
        sb.append(this.f108797a);
        sb.append(", fps=");
        sb.append(this.f108798b);
        sb.append(", bitrate=");
        return d.a(this.f108799c, ")", sb);
    }
}
