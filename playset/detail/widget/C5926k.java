package com.bilibili.playset.detail.widget;

import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;

/* JADX INFO: renamed from: com.bilibili.playset.detail.widget.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/widget/k.class */
public final class C5926k implements NestedScrollConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScrollableState f84646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableFloatState f84647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableFloatState f84648c;

    public C5926k(ScrollableState scrollableState, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2) {
        this.f84646a = scrollableState;
        this.f84647b = mutableFloatState;
        this.f84648c = mutableFloatState2;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo1279onPostScrollDzOQY0M(long j7, long j8, int i7) {
        int i8 = (int) (4294967295L & j8);
        return Float.intBitsToFloat(i8) > 0.0f ? Offset.m2449copydBAh8RU$default(j8, 0.0f, this.f84646a.dispatchRawDelta(Float.intBitsToFloat(i8)), 1, null) : Offset.Companion.m2471getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo1490onPreScrollOzD1aCk(long j7, int i7) {
        if (Float.intBitsToFloat((int) (j7 >> 32)) != 0.0f) {
            return Offset.Companion.m2471getZeroF1C5BW0();
        }
        int i8 = (int) (4294967295L & j7);
        return (Float.intBitsToFloat(i8) >= 0.0f || this.f84647b.getFloatValue() >= this.f84648c.getFloatValue()) ? Offset.Companion.m2471getZeroF1C5BW0() : Offset.m2449copydBAh8RU$default(j7, 0.0f, this.f84646a.dispatchRawDelta(Float.intBitsToFloat(i8)), 1, null);
    }
}
