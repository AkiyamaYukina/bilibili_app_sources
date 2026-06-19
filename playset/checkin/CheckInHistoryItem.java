package com.bilibili.playset.checkin;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/checkin/CheckInHistoryItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class CheckInHistoryItem extends CheckInHistoryType {
    public static final int $stable = 8;

    @JSONField(name = "checkin_status")
    private int checkInStatus;

    @JSONField(name = "cumulative_duration")
    @Nullable
    private Long cumulativeDuration;

    @JSONField(name = "etime")
    @Nullable
    private Long etime;

    @JSONField(name = "stime")
    @Nullable
    private Long stime;

    public CheckInHistoryItem() {
        this(0, null, null, null, 15, null);
    }

    public CheckInHistoryItem(int i7, @Nullable Long l7, @Nullable Long l8, @Nullable Long l9) {
        this.checkInStatus = i7;
        this.cumulativeDuration = l7;
        this.etime = l8;
        this.stime = l9;
    }

    public /* synthetic */ CheckInHistoryItem(int i7, Long l7, Long l8, Long l9, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i7, (i8 & 2) != 0 ? 0L : l7, (i8 & 4) != 0 ? 0L : l8, (i8 & 8) != 0 ? 0L : l9);
    }

    public static /* synthetic */ CheckInHistoryItem copy$default(CheckInHistoryItem checkInHistoryItem, int i7, Long l7, Long l8, Long l9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = checkInHistoryItem.checkInStatus;
        }
        if ((i8 & 2) != 0) {
            l7 = checkInHistoryItem.cumulativeDuration;
        }
        if ((i8 & 4) != 0) {
            l8 = checkInHistoryItem.etime;
        }
        if ((i8 & 8) != 0) {
            l9 = checkInHistoryItem.stime;
        }
        return checkInHistoryItem.copy(i7, l7, l8, l9);
    }

    public final int component1() {
        return this.checkInStatus;
    }

    @Nullable
    public final Long component2() {
        return this.cumulativeDuration;
    }

    @Nullable
    public final Long component3() {
        return this.etime;
    }

    @Nullable
    public final Long component4() {
        return this.stime;
    }

    @NotNull
    public final CheckInHistoryItem copy(int i7, @Nullable Long l7, @Nullable Long l8, @Nullable Long l9) {
        return new CheckInHistoryItem(i7, l7, l8, l9);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckInHistoryItem)) {
            return false;
        }
        CheckInHistoryItem checkInHistoryItem = (CheckInHistoryItem) obj;
        return this.checkInStatus == checkInHistoryItem.checkInStatus && Intrinsics.areEqual(this.cumulativeDuration, checkInHistoryItem.cumulativeDuration) && Intrinsics.areEqual(this.etime, checkInHistoryItem.etime) && Intrinsics.areEqual(this.stime, checkInHistoryItem.stime);
    }

    public final int getCheckInStatus() {
        return this.checkInStatus;
    }

    @Nullable
    public final Long getCumulativeDuration() {
        return this.cumulativeDuration;
    }

    @Nullable
    public final Long getEtime() {
        return this.etime;
    }

    @Nullable
    public final Long getStime() {
        return this.stime;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.checkInStatus);
        Long l7 = this.cumulativeDuration;
        int iHashCode2 = 0;
        int iHashCode3 = l7 == null ? 0 : l7.hashCode();
        Long l8 = this.etime;
        int iHashCode4 = l8 == null ? 0 : l8.hashCode();
        Long l9 = this.stime;
        if (l9 != null) {
            iHashCode2 = l9.hashCode();
        }
        return (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2;
    }

    public final void setCheckInStatus(int i7) {
        this.checkInStatus = i7;
    }

    public final void setCumulativeDuration(@Nullable Long l7) {
        this.cumulativeDuration = l7;
    }

    public final void setEtime(@Nullable Long l7) {
        this.etime = l7;
    }

    public final void setStime(@Nullable Long l7) {
        this.stime = l7;
    }

    @NotNull
    public String toString() {
        return "CheckInHistoryItem(checkInStatus=" + this.checkInStatus + ", cumulativeDuration=" + this.cumulativeDuration + ", etime=" + this.etime + ", stime=" + this.stime + ")";
    }
}
