package com.bilibili.opd.app.bizcommon.context;

import androidx.annotation.Keep;
import androidx.fragment.app.z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/ActivityInfo.class */
@Keep
public final class ActivityInfo {

    @Nullable
    private String activityName;

    @Nullable
    private Integer hashCode;

    @Nullable
    private String packageName;

    public ActivityInfo(@Nullable Integer num, @Nullable String str, @Nullable String str2) {
        this.hashCode = num;
        this.packageName = str;
        this.activityName = str2;
    }

    public static /* synthetic */ ActivityInfo copy$default(ActivityInfo activityInfo, Integer num, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = activityInfo.hashCode;
        }
        if ((i7 & 2) != 0) {
            str = activityInfo.packageName;
        }
        if ((i7 & 4) != 0) {
            str2 = activityInfo.activityName;
        }
        return activityInfo.copy(num, str, str2);
    }

    @Nullable
    public final Integer component1() {
        return this.hashCode;
    }

    @Nullable
    public final String component2() {
        return this.packageName;
    }

    @Nullable
    public final String component3() {
        return this.activityName;
    }

    @NotNull
    public final ActivityInfo copy(@Nullable Integer num, @Nullable String str, @Nullable String str2) {
        return new ActivityInfo(num, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(ActivityInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        ActivityInfo activityInfo = (ActivityInfo) obj;
        return Intrinsics.areEqual(this.hashCode, activityInfo.hashCode) && Intrinsics.areEqual(this.packageName, activityInfo.packageName) && Intrinsics.areEqual(this.activityName, activityInfo.activityName);
    }

    @Nullable
    public final String getActivityName() {
        return this.activityName;
    }

    @Nullable
    public final Integer getHashCode() {
        return this.hashCode;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        Integer num = this.hashCode;
        int iHashCode = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        String str = this.packageName;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.activityName;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return (((iIntValue * 31) + iHashCode2) * 31) + iHashCode;
    }

    public final void setActivityName(@Nullable String str) {
        this.activityName = str;
    }

    public final void setHashCode(@Nullable Integer num) {
        this.hashCode = num;
    }

    public final void setPackageName(@Nullable String str) {
        this.packageName = str;
    }

    @NotNull
    public String toString() {
        Integer num = this.hashCode;
        String str = this.packageName;
        return C8770a.a(z.b("ActivityInfo(hashCode=", num, ", packageName=", str, ", activityName="), this.activityName, ")");
    }
}
