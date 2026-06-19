package com.bilibili.ogv.bdesign.tab;

import androidx.compose.foundation.C3552m0;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.A;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bdesign/tab/e.class */
@Immutable
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f67429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f67430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f67431c;

    public e(float f7, float f8, float f9) {
        this.f67429a = f7;
        this.f67430b = f8;
        this.f67431c = f9;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Dp.m3885equalsimpl0(this.f67429a, eVar.f67429a) && Dp.m3885equalsimpl0(this.f67430b, eVar.f67430b) && Dp.m3885equalsimpl0(this.f67431c, eVar.f67431c);
    }

    public final int hashCode() {
        return Dp.m3886hashCodeimpl(this.f67431c) + C3552m0.b(this.f67430b, Dp.m3886hashCodeimpl(this.f67429a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        float f7 = this.f67429a;
        String strM3891toStringimpl = Dp.m3891toStringimpl(f7);
        float f8 = this.f67430b;
        return A.a(Dp.m3891toStringimpl(f8), ", contentWidth=", Dp.m3891toStringimpl(this.f67431c), ")", G0.b.a("TabPosition(left=", strM3891toStringimpl, ", right=", Dp.m3891toStringimpl(Dp.m3880constructorimpl(f7 + f8)), ", width="));
    }
}
