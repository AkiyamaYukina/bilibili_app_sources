package com.bilibili.playerbizcommonv2.widget.quality;

import androidx.compose.foundation.C3552m0;
import androidx.compose.foundation.text.C3631i;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.quality.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/j.class */
@StabilityInferred(parameters = 1)
public final class C5813j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f82839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f82840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f82841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f82842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f82843e;

    public C5813j(float f7, float f8, float f9, long j7, long j8) {
        this.f82839a = f7;
        this.f82840b = f8;
        this.f82841c = j7;
        this.f82842d = j8;
        this.f82843e = f9;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5813j)) {
            return false;
        }
        C5813j c5813j = (C5813j) obj;
        return Dp.m3885equalsimpl0(this.f82839a, c5813j.f82839a) && Dp.m3885equalsimpl0(this.f82840b, c5813j.f82840b) && TextUnit.m3987equalsimpl0(this.f82841c, c5813j.f82841c) && TextUnit.m3987equalsimpl0(this.f82842d, c5813j.f82842d) && Dp.m3885equalsimpl0(this.f82843e, c5813j.f82843e);
    }

    public final int hashCode() {
        return Dp.m3886hashCodeimpl(this.f82843e) + C3631i.b(C3631i.b(C3552m0.b(this.f82840b, Dp.m3886hashCodeimpl(this.f82839a) * 31, 31), 31, this.f82841c), 31, this.f82842d);
    }

    @NotNull
    public final String toString() {
        String strM3891toStringimpl = Dp.m3891toStringimpl(this.f82839a);
        String strM3891toStringimpl2 = Dp.m3891toStringimpl(this.f82840b);
        String strM3997toStringimpl = TextUnit.m3997toStringimpl(this.f82841c);
        String strM3997toStringimpl2 = TextUnit.m3997toStringimpl(this.f82842d);
        String strM3891toStringimpl3 = Dp.m3891toStringimpl(this.f82843e);
        StringBuilder sbA = G0.b.a("HdrCardStyle(imgWidth=", strM3891toStringimpl, ", imgHeight=", strM3891toStringimpl2, ", titleSize=");
        androidx.room.B.a(strM3997toStringimpl, ", subtitleSize=", strM3997toStringimpl2, ", verticalSpace=", sbA);
        return C8770a.a(sbA, strM3891toStringimpl3, ")");
    }
}
