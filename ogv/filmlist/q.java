package com.bilibili.ogv.filmlist;

import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/q.class */
public final class q implements NestedScrollConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopAppBarScrollBehavior f67792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f67793b;

    public q(TopAppBarScrollBehavior topAppBarScrollBehavior, float f7) {
        this.f67792a = topAppBarScrollBehavior;
        this.f67793b = f7;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo1279onPostScrollDzOQY0M(long j7, long j8, int i7) {
        TopAppBarScrollBehavior topAppBarScrollBehavior = this.f67792a;
        if (topAppBarScrollBehavior == null) {
            return Offset.Companion.m2471getZeroF1C5BW0();
        }
        return r.e(Float.intBitsToFloat((int) (4294967295L & j8)), this.f67793b) ? topAppBarScrollBehavior.getNestedScrollConnection().mo1279onPostScrollDzOQY0M(j7, j8, i7) : Offset.Companion.m2471getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo1490onPreScrollOzD1aCk(long j7, int i7) {
        TopAppBarScrollBehavior topAppBarScrollBehavior = this.f67792a;
        if (topAppBarScrollBehavior == null) {
            return Offset.Companion.m2471getZeroF1C5BW0();
        }
        return r.e(Float.intBitsToFloat((int) (4294967295L & j7)), this.f67793b) ? topAppBarScrollBehavior.getNestedScrollConnection().mo1490onPreScrollOzD1aCk(j7, i7) : Offset.Companion.m2471getZeroF1C5BW0();
    }
}
