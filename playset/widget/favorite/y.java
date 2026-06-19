package com.bilibili.playset.widget.favorite;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/y.class */
public final class y implements NestedScrollConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f85818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f85819b;

    public y(n nVar, float f7) {
        this.f85818a = nVar;
        this.f85819b = f7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo1279onPostScrollDzOQY0M(long j7, long j8, int i7) {
        n nVar = this.f85818a;
        if (((Boolean) nVar.f85771a.getValue()).booleanValue()) {
            return Offset.Companion.m2471getZeroF1C5BW0();
        }
        int i8 = (int) (j8 & 4294967295L);
        if (Float.intBitsToFloat(i8) <= 0.0f) {
            return Offset.Companion.m2471getZeroF1C5BW0();
        }
        MutableFloatState mutableFloatState = nVar.f85773c;
        mutableFloatState.setFloatValue(RangesKt.coerceAtMost(Float.intBitsToFloat(i8) + mutableFloatState.getFloatValue(), this.f85819b));
        return Offset.m2447constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i8))) & 4294967295L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo1490onPreScrollOzD1aCk(long j7, int i7) {
        n nVar = this.f85818a;
        if (((Boolean) nVar.f85771a.getValue()).booleanValue()) {
            return Offset.Companion.m2471getZeroF1C5BW0();
        }
        MutableFloatState mutableFloatState = nVar.f85773c;
        if (mutableFloatState.getFloatValue() > 0.0f) {
            int i8 = (int) (j7 & 4294967295L);
            if (Float.intBitsToFloat(i8) > 0.0f) {
                float fCoerceAtMost = RangesKt.coerceAtMost(Float.intBitsToFloat(i8), mutableFloatState.getFloatValue());
                mutableFloatState.setFloatValue(mutableFloatState.getFloatValue() - fCoerceAtMost);
                return Offset.m2447constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fCoerceAtMost)) & 4294967295L));
            }
        }
        return Offset.Companion.m2471getZeroF1C5BW0();
    }
}
