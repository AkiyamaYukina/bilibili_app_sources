package com.bilibili.ogv.rank;

import androidx.compose.foundation.C3552m0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/U.class */
@StabilityInferred(parameters = 1)
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f71897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f71898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f71899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f71900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f71901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f71902f;

    public U() {
        float fM3880constructorimpl = Dp.m3880constructorimpl(170);
        float fM3880constructorimpl2 = Dp.m3880constructorimpl(44);
        float fM3880constructorimpl3 = Dp.m3880constructorimpl(12);
        float fM3880constructorimpl4 = Dp.m3880constructorimpl(3);
        float fM3880constructorimpl5 = Dp.m3880constructorimpl(40);
        float fM3880constructorimpl6 = Dp.m3880constructorimpl(22);
        this.f71897a = fM3880constructorimpl;
        this.f71898b = fM3880constructorimpl2;
        this.f71899c = fM3880constructorimpl3;
        this.f71900d = fM3880constructorimpl4;
        this.f71901e = fM3880constructorimpl5;
        this.f71902f = fM3880constructorimpl6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u7 = (U) obj;
        return Dp.m3885equalsimpl0(this.f71897a, u7.f71897a) && Dp.m3885equalsimpl0(this.f71898b, u7.f71898b) && Dp.m3885equalsimpl0(this.f71899c, u7.f71899c) && Dp.m3885equalsimpl0(this.f71900d, u7.f71900d) && Dp.m3885equalsimpl0(this.f71901e, u7.f71901e) && Dp.m3885equalsimpl0(this.f71902f, u7.f71902f);
    }

    public final int hashCode() {
        return Dp.m3886hashCodeimpl(this.f71902f) + C3552m0.b(this.f71901e, C3552m0.b(this.f71900d, C3552m0.b(this.f71899c, C3552m0.b(this.f71898b, Dp.m3886hashCodeimpl(this.f71897a) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        String strM3891toStringimpl = Dp.m3891toStringimpl(this.f71897a);
        String strM3891toStringimpl2 = Dp.m3891toStringimpl(this.f71898b);
        String strM3891toStringimpl3 = Dp.m3891toStringimpl(this.f71899c);
        String strM3891toStringimpl4 = Dp.m3891toStringimpl(this.f71900d);
        String strM3891toStringimpl5 = Dp.m3891toStringimpl(this.f71901e);
        String strM3891toStringimpl6 = Dp.m3891toStringimpl(this.f71902f);
        StringBuilder sbA = G0.b.a("TopAppBarConfig(expandedHeight=", strM3891toStringimpl, ", collapsedHeight=", strM3891toStringimpl2, ", cornerRadius=");
        androidx.room.B.a(strM3891toStringimpl3, ", indicatorRadius=", strM3891toStringimpl4, ", tabHeight=", sbA);
        return androidx.fragment.app.A.a(strM3891toStringimpl5, ", iconSize=", strM3891toStringimpl6, ")", sbA);
    }
}
