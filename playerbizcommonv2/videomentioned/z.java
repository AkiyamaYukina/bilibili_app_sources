package com.bilibili.playerbizcommonv2.videomentioned;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.core.view.NestedScrollingChildHelper;
import kotlin.collections.ArraysKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/z.class */
public final class z implements NestedScrollConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NestedScrollingChildHelper f82066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f82067b;

    public z(NestedScrollingChildHelper nestedScrollingChildHelper, int[] iArr) {
        this.f82066a = nestedScrollingChildHelper;
        this.f82067b = iArr;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo1279onPostScrollDzOQY0M(long j7, long j8, int i7) {
        int i8 = !NestedScrollSource.m3024equalsimpl0(i7, NestedScrollSource.Companion.m3032getDragWNlRxjI()) ? 1 : 0;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.f82066a;
        nestedScrollingChildHelper.startNestedScroll(2, i8);
        int[] iArr = this.f82067b;
        ArraysKt.t(0, 0, 6, iArr);
        int i9 = (int) (j8 & 4294967295L);
        nestedScrollingChildHelper.dispatchNestedScroll(((int) Float.intBitsToFloat((int) (j7 >> 32))) * (-1), ((int) Float.intBitsToFloat((int) (j7 & 4294967295L))) * (-1), ((int) Float.intBitsToFloat((int) (j8 >> 32))) * (-1), ((int) Float.intBitsToFloat(i9)) * (-1), null, i8, iArr);
        float f7 = iArr[1] * (-1.0f);
        return Offset.m2447constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i9) >= 0.0f ? RangesKt.coerceAtMost(f7, Float.intBitsToFloat(i9)) : RangesKt.coerceAtLeast(f7, Float.intBitsToFloat(i9)))) & 4294967295L));
    }
}
