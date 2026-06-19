package com.bilibili.playset.checkin;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/checkin/CheckInNotice.class */
@StabilityInferred(parameters = 0)
@Keep
public final class CheckInNotice {
    public static final int $stable = 8;

    @JSONField(name = "push_time")
    @Nullable
    private Integer pushTime;

    @JSONField(name = "reminder_status")
    @Nullable
    private Integer reminderStatus;

    public CheckInNotice() {
        this(null, null, 3, null);
    }

    public CheckInNotice(@Nullable Integer num, @Nullable Integer num2) {
        this.reminderStatus = num;
        this.pushTime = num2;
    }

    public /* synthetic */ CheckInNotice(Integer num, Integer num2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : num, (i7 & 2) != 0 ? 0 : num2);
    }

    public static /* synthetic */ CheckInNotice copy$default(CheckInNotice checkInNotice, Integer num, Integer num2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = checkInNotice.reminderStatus;
        }
        if ((i7 & 2) != 0) {
            num2 = checkInNotice.pushTime;
        }
        return checkInNotice.copy(num, num2);
    }

    @Nullable
    public final Integer component1() {
        return this.reminderStatus;
    }

    @Nullable
    public final Integer component2() {
        return this.pushTime;
    }

    @NotNull
    public final CheckInNotice copy(@Nullable Integer num, @Nullable Integer num2) {
        return new CheckInNotice(num, num2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckInNotice)) {
            return false;
        }
        CheckInNotice checkInNotice = (CheckInNotice) obj;
        return Intrinsics.areEqual(this.reminderStatus, checkInNotice.reminderStatus) && Intrinsics.areEqual(this.pushTime, checkInNotice.pushTime);
    }

    @Nullable
    public final Integer getPushTime() {
        return this.pushTime;
    }

    @Nullable
    public final Integer getReminderStatus() {
        return this.reminderStatus;
    }

    public int hashCode() {
        Integer num = this.reminderStatus;
        int iHashCode = 0;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.pushTime;
        if (num2 != null) {
            iHashCode = num2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final void setPushTime(@Nullable Integer num) {
        this.pushTime = num;
    }

    public final void setReminderStatus(@Nullable Integer num) {
        this.reminderStatus = num;
    }

    @NotNull
    public String toString() {
        return "CheckInNotice(reminderStatus=" + this.reminderStatus + ", pushTime=" + this.pushTime + ")";
    }
}
