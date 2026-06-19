package com.bilibili.search2.halfscreen;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/h.class */
@StabilityInferred(parameters = 1)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f86582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.search2.main.ogv.d f86583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.search2.main.ogv.f f86584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.search2.main.ogv.a f86585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Dp f86586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f86587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f86588g;
    public final boolean h;

    public h(boolean z6, com.bilibili.search2.main.ogv.d dVar, com.bilibili.search2.main.ogv.f fVar, com.bilibili.search2.main.ogv.a aVar, Dp dp, int i7, float f7, boolean z7) {
        this.f86582a = z6;
        this.f86583b = dVar;
        this.f86584c = fVar;
        this.f86585d = aVar;
        this.f86586e = dp;
        this.f86587f = i7;
        this.f86588g = f7;
        this.h = z7;
    }

    public static h a(h hVar, boolean z6, com.bilibili.search2.main.ogv.d dVar, com.bilibili.search2.main.ogv.f fVar, com.bilibili.search2.main.ogv.a aVar, Dp dp, int i7, float f7, boolean z7, int i8) {
        if ((i8 & 1) != 0) {
            z6 = hVar.f86582a;
        }
        if ((i8 & 2) != 0) {
            dVar = hVar.f86583b;
        }
        if ((i8 & 4) != 0) {
            fVar = hVar.f86584c;
        }
        if ((i8 & 8) != 0) {
            aVar = hVar.f86585d;
        }
        if ((i8 & 16) != 0) {
            dp = hVar.f86586e;
        }
        if ((i8 & 32) != 0) {
            i7 = hVar.f86587f;
        }
        if ((i8 & 64) != 0) {
            f7 = hVar.f86588g;
        }
        if ((i8 & 128) != 0) {
            z7 = hVar.h;
        }
        hVar.getClass();
        return new h(z6, dVar, fVar, aVar, dp, i7, f7, z7);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f86582a == hVar.f86582a && Intrinsics.areEqual(this.f86583b, hVar.f86583b) && Intrinsics.areEqual(this.f86584c, hVar.f86584c) && Intrinsics.areEqual(this.f86585d, hVar.f86585d) && Intrinsics.areEqual(this.f86586e, hVar.f86586e) && this.f86587f == hVar.f86587f && Float.compare(this.f86588g, hVar.f86588g) == 0 && this.h == hVar.h;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f86582a);
        int iHashCode2 = this.f86583b.hashCode();
        int iHashCode3 = this.f86584c.hashCode();
        int iHashCode4 = this.f86585d.hashCode();
        Dp dp = this.f86586e;
        return Boolean.hashCode(this.h) + androidx.compose.animation.n.a(this.f86588g, I.a(this.f86587f, (((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31) + (dp == null ? 0 : Dp.m3886hashCodeimpl(dp.m3894unboximpl()))) * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        return "SearchCoreHostState(isFullScreen=" + this.f86582a + ", ogvBackground=" + this.f86583b + ", ogvMaskOverlay=" + this.f86584c + ", brandAdGradientOverlay=" + this.f86585d + ", topBarTargetHeight=" + this.f86586e + ", bottomSheetHeight=" + this.f86587f + ", bottomSheetSlideOffset=" + this.f86588g + ", isContainerClosingOrHidden=" + this.h + ")";
    }
}
