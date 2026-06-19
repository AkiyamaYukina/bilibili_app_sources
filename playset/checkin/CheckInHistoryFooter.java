package com.bilibili.playset.checkin;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/checkin/CheckInHistoryFooter.class */
@StabilityInferred(parameters = 1)
@Keep
public final class CheckInHistoryFooter extends CheckInHistoryType {
    public static final int $stable = 0;
    private final long count;
    private final long totalTime;

    public CheckInHistoryFooter() {
        this(0L, 0L, 3, null);
    }

    public CheckInHistoryFooter(long j7, long j8) {
        this.count = j7;
        this.totalTime = j8;
    }

    public /* synthetic */ CheckInHistoryFooter(long j7, long j8, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : j7, (i7 & 2) != 0 ? 0L : j8);
    }

    public final long getCount() {
        return this.count;
    }

    public final long getTotalTime() {
        return this.totalTime;
    }
}
