package com.bilibili.playset.checkin;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/checkin/CheckInData.class */
@StabilityInferred(parameters = 0)
@Keep
public final class CheckInData {
    public static final int $stable = 8;

    @JSONField(name = "current")
    @Nullable
    private CheckInList current;

    @JSONField(name = "past")
    @Nullable
    private CheckInFinishedList past;

    public CheckInData() {
        this(null, null, 3, null);
    }

    public CheckInData(@Nullable CheckInList checkInList, @Nullable CheckInFinishedList checkInFinishedList) {
        this.current = checkInList;
        this.past = checkInFinishedList;
    }

    public /* synthetic */ CheckInData(CheckInList checkInList, CheckInFinishedList checkInFinishedList, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : checkInList, (i7 & 2) != 0 ? null : checkInFinishedList);
    }

    public static /* synthetic */ CheckInData copy$default(CheckInData checkInData, CheckInList checkInList, CheckInFinishedList checkInFinishedList, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            checkInList = checkInData.current;
        }
        if ((i7 & 2) != 0) {
            checkInFinishedList = checkInData.past;
        }
        return checkInData.copy(checkInList, checkInFinishedList);
    }

    @Nullable
    public final CheckInList component1() {
        return this.current;
    }

    @Nullable
    public final CheckInFinishedList component2() {
        return this.past;
    }

    @NotNull
    public final CheckInData copy(@Nullable CheckInList checkInList, @Nullable CheckInFinishedList checkInFinishedList) {
        return new CheckInData(checkInList, checkInFinishedList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckInData)) {
            return false;
        }
        CheckInData checkInData = (CheckInData) obj;
        return Intrinsics.areEqual(this.current, checkInData.current) && Intrinsics.areEqual(this.past, checkInData.past);
    }

    @Nullable
    public final CheckInList getCurrent() {
        return this.current;
    }

    @Nullable
    public final CheckInFinishedList getPast() {
        return this.past;
    }

    public int hashCode() {
        CheckInList checkInList = this.current;
        int iHashCode = 0;
        int iHashCode2 = checkInList == null ? 0 : checkInList.hashCode();
        CheckInFinishedList checkInFinishedList = this.past;
        if (checkInFinishedList != null) {
            iHashCode = checkInFinishedList.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final void setCurrent(@Nullable CheckInList checkInList) {
        this.current = checkInList;
    }

    public final void setPast(@Nullable CheckInFinishedList checkInFinishedList) {
        this.past = checkInFinishedList;
    }

    @NotNull
    public String toString() {
        return "CheckInData(current=" + this.current + ", past=" + this.past + ")";
    }
}
