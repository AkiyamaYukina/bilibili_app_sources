package com.bilibili.ogv.filmlist;

import androidx.compose.foundation.C3552m0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/C.class */
@StabilityInferred(parameters = 1)
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f67613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f67614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f67615c;

    public C() {
        float fM3880constructorimpl = Dp.m3880constructorimpl(104);
        float fM3880constructorimpl2 = Dp.m3880constructorimpl(44);
        float fM3880constructorimpl3 = Dp.m3880constructorimpl(24);
        this.f67613a = fM3880constructorimpl;
        this.f67614b = fM3880constructorimpl2;
        this.f67615c = fM3880constructorimpl3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c7 = (C) obj;
        return Dp.m3885equalsimpl0(this.f67613a, c7.f67613a) && Dp.m3885equalsimpl0(this.f67614b, c7.f67614b) && Dp.m3885equalsimpl0(this.f67615c, c7.f67615c);
    }

    public final int hashCode() {
        return Dp.m3886hashCodeimpl(this.f67615c) + C3552m0.b(this.f67614b, Dp.m3886hashCodeimpl(this.f67613a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        String strM3891toStringimpl = Dp.m3891toStringimpl(this.f67613a);
        String strM3891toStringimpl2 = Dp.m3891toStringimpl(this.f67614b);
        return C8770a.a(G0.b.a("TopAppBarConfig(expandedHeight=", strM3891toStringimpl, ", collapsedHeight=", strM3891toStringimpl2, ", iconSize="), Dp.m3891toStringimpl(this.f67615c), ")");
    }
}
