package com.bilibili.ogv.operation.entrance.filmlist;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/filmlist/f.class */
public final class f implements androidx.compose.ui.window.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Alignment f70040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f70041b;

    public f(Alignment alignment, long j7) {
        this.f70040a = alignment;
        this.f70041b = j7;
    }

    @Override // androidx.compose.ui.window.n
    public final long a(@NotNull y0.g gVar, long j7, @NotNull LayoutDirection layoutDirection, long j8) {
        long j9 = 0;
        long j10 = j9 & 4294967295L;
        long jM3940constructorimpl = IntOffset.m3940constructorimpl((j9 << 32) | j10);
        IntSize.Companion companion = IntSize.Companion;
        long jMo2334alignKFBX0sM = this.f70040a.mo2334alignKFBX0sM(companion.m3977getZeroYbymL2g(), IntSize.m3967constructorimpl((((long) gVar.b()) & 4294967295L) | (((long) gVar.e()) << 32)), layoutDirection);
        long jMo2334alignKFBX0sM2 = this.f70040a.mo2334alignKFBX0sM(companion.m3977getZeroYbymL2g(), IntSize.m3967constructorimpl(j10 | (((long) ((int) (j8 >> 32))) << 32)), layoutDirection);
        long jM3949minusqkQi6aY = IntOffset.m3949minusqkQi6aY(IntOffset.m3950plusqkQi6aY(IntOffset.m3950plusqkQi6aY(jM3940constructorimpl, IntOffset.m3940constructorimpl((((long) gVar.f129543a) << 32) | (((long) gVar.f129544b) & 4294967295L))), jMo2334alignKFBX0sM), IntOffset.m3940constructorimpl((((long) IntOffset.m3947getYimpl(jMo2334alignKFBX0sM2)) & 4294967295L) | (((long) IntOffset.m3946getXimpl(jMo2334alignKFBX0sM2)) << 32)));
        long j11 = this.f70041b;
        long jM3950plusqkQi6aY = IntOffset.m3950plusqkQi6aY(jM3949minusqkQi6aY, IntOffset.m3940constructorimpl((((long) (IntOffset.m3946getXimpl(j11) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1))) << 32) | (4294967295L & ((long) IntOffset.m3947getYimpl(j11)))));
        defpackage.a.b("[ogv-operation-FilmListHeadPopupPositionProvider-calculatePosition-llwVHH4] ", "OperationPopupGuidance  anchorBounds: " + gVar + ", popupContentSize: " + IntSize.m3975toStringimpl(j8) + ", popupPosition: " + IntOffset.m3953toStringimpl(jM3950plusqkQi6aY), "FilmListHeadPopupPositionProvider-calculatePosition-llwVHH4");
        return jM3950plusqkQi6aY;
    }
}
