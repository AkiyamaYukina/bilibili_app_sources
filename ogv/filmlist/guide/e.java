package com.bilibili.ogv.filmlist.guide;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.n;
import org.jetbrains.annotations.NotNull;
import y0.g;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/guide/e.class */
@StabilityInferred(parameters = 1)
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Alignment f67712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f67713b;

    public e(Alignment alignment, long j7) {
        this.f67712a = alignment;
        this.f67713b = j7;
    }

    @Override // androidx.compose.ui.window.n
    public final long a(@NotNull g gVar, long j7, @NotNull LayoutDirection layoutDirection, long j8) {
        long j9 = 0;
        long j10 = j9 & 4294967295L;
        long jM3940constructorimpl = IntOffset.m3940constructorimpl((j9 << 32) | j10);
        IntSize.Companion companion = IntSize.Companion;
        long jMo2334alignKFBX0sM = this.f67712a.mo2334alignKFBX0sM(companion.m3977getZeroYbymL2g(), IntSize.m3967constructorimpl((((long) gVar.b()) & 4294967295L) | (((long) gVar.e()) << 32)), layoutDirection);
        long jMo2334alignKFBX0sM2 = this.f67712a.mo2334alignKFBX0sM(companion.m3977getZeroYbymL2g(), IntSize.m3967constructorimpl(j10 | (((long) ((int) (j8 >> 32))) << 32)), layoutDirection);
        long jM3949minusqkQi6aY = IntOffset.m3949minusqkQi6aY(IntOffset.m3950plusqkQi6aY(IntOffset.m3950plusqkQi6aY(jM3940constructorimpl, IntOffset.m3940constructorimpl((((long) gVar.f129543a) << 32) | (((long) gVar.f129544b) & 4294967295L))), jMo2334alignKFBX0sM), IntOffset.m3940constructorimpl((((long) IntOffset.m3947getYimpl(jMo2334alignKFBX0sM2)) & 4294967295L) | (((long) IntOffset.m3946getXimpl(jMo2334alignKFBX0sM2)) << 32)));
        long j11 = this.f67713b;
        return IntOffset.m3950plusqkQi6aY(jM3949minusqkQi6aY, IntOffset.m3940constructorimpl((((long) (IntOffset.m3946getXimpl(j11) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1))) << 32) | (((long) IntOffset.m3947getYimpl(j11)) & 4294967295L)));
    }
}
