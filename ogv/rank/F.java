package com.bilibili.ogv.rank;

import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/F.class */
public final class F implements NestedScrollConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopAppBarScrollBehavior f71830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f71831b;

    public F(TopAppBarScrollBehavior topAppBarScrollBehavior, float f7) {
        this.f71830a = topAppBarScrollBehavior;
        this.f71831b = f7;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo1279onPostScrollDzOQY0M(long j7, long j8, int i7) {
        TopAppBarScrollBehavior topAppBarScrollBehavior = this.f71830a;
        if (topAppBarScrollBehavior == null) {
            return Offset.Companion.m2471getZeroF1C5BW0();
        }
        return PageReadyUiKt.l(Float.intBitsToFloat((int) (4294967295L & j8)), this.f71831b) ? topAppBarScrollBehavior.getNestedScrollConnection().mo1279onPostScrollDzOQY0M(j7, j8, i7) : Offset.Companion.m2471getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo1490onPreScrollOzD1aCk(long j7, int i7) {
        TopAppBarScrollBehavior topAppBarScrollBehavior = this.f71830a;
        if (topAppBarScrollBehavior == null) {
            return Offset.Companion.m2471getZeroF1C5BW0();
        }
        return PageReadyUiKt.l(Float.intBitsToFloat((int) (4294967295L & j7)), this.f71831b) ? topAppBarScrollBehavior.getNestedScrollConnection().mo1490onPreScrollOzD1aCk(j7, i7) : Offset.Companion.m2471getZeroF1C5BW0();
    }
}
