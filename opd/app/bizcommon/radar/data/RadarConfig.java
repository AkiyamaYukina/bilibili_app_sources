package com.bilibili.opd.app.bizcommon.radar.data;

import X1.F;
import androidx.annotation.Keep;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.analytics.C4668j;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z4.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/data/RadarConfig.class */
@StabilityInferred(parameters = 0)
@Keep
public final class RadarConfig {
    public static final int $stable = 8;
    private boolean enable;
    private long expireTime;

    @Nullable
    private List<String> homeSpTypeList;

    @Nullable
    private List<String> neuronWhiteList;
    private int packageSize;

    @Nullable
    private List<String> regexsList;

    @Nullable
    private List<String> spTypeList;
    private long trackExpiredTime;

    public RadarConfig() {
        this(0, false, 0L, 0L, null, null, null, null, 255, null);
    }

    public RadarConfig(int i7, boolean z6, long j7, long j8, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable List<String> list4) {
        this.packageSize = i7;
        this.enable = z6;
        this.expireTime = j7;
        this.trackExpiredTime = j8;
        this.spTypeList = list;
        this.neuronWhiteList = list2;
        this.regexsList = list3;
        this.homeSpTypeList = list4;
    }

    public /* synthetic */ RadarConfig(int i7, boolean z6, long j7, long j8, List list, List list2, List list3, List list4, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 5 : i7, (i8 & 2) != 0 ? false : z6, (i8 & 4) != 0 ? 5000L : j7, (i8 & 8) != 0 ? 500L : j8, (i8 & 16) != 0 ? CollectionsKt.emptyList() : list, (i8 & 32) != 0 ? CollectionsKt.emptyList() : list2, (i8 & 64) != 0 ? CollectionsKt.emptyList() : list3, (i8 & 128) != 0 ? CollectionsKt.emptyList() : list4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RadarConfig copy$default(RadarConfig radarConfig, int i7, boolean z6, long j7, long j8, List list, List list2, List list3, List list4, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = radarConfig.packageSize;
        }
        if ((i8 & 2) != 0) {
            z6 = radarConfig.enable;
        }
        if ((i8 & 4) != 0) {
            j7 = radarConfig.expireTime;
        }
        if ((i8 & 8) != 0) {
            j8 = radarConfig.trackExpiredTime;
        }
        if ((i8 & 16) != 0) {
            list = radarConfig.spTypeList;
        }
        if ((i8 & 32) != 0) {
            list2 = radarConfig.neuronWhiteList;
        }
        if ((i8 & 64) != 0) {
            list3 = radarConfig.regexsList;
        }
        if ((i8 & 128) != 0) {
            list4 = radarConfig.homeSpTypeList;
        }
        return radarConfig.copy(i7, z6, j7, j8, list, list2, list3, list4);
    }

    public final int component1() {
        return this.packageSize;
    }

    public final boolean component2() {
        return this.enable;
    }

    public final long component3() {
        return this.expireTime;
    }

    public final long component4() {
        return this.trackExpiredTime;
    }

    @Nullable
    public final List<String> component5() {
        return this.spTypeList;
    }

    @Nullable
    public final List<String> component6() {
        return this.neuronWhiteList;
    }

    @Nullable
    public final List<String> component7() {
        return this.regexsList;
    }

    @Nullable
    public final List<String> component8() {
        return this.homeSpTypeList;
    }

    @NotNull
    public final RadarConfig copy(int i7, boolean z6, long j7, long j8, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable List<String> list4) {
        return new RadarConfig(i7, z6, j7, j8, list, list2, list3, list4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadarConfig)) {
            return false;
        }
        RadarConfig radarConfig = (RadarConfig) obj;
        return this.packageSize == radarConfig.packageSize && this.enable == radarConfig.enable && this.expireTime == radarConfig.expireTime && this.trackExpiredTime == radarConfig.trackExpiredTime && Intrinsics.areEqual(this.spTypeList, radarConfig.spTypeList) && Intrinsics.areEqual(this.neuronWhiteList, radarConfig.neuronWhiteList) && Intrinsics.areEqual(this.regexsList, radarConfig.regexsList) && Intrinsics.areEqual(this.homeSpTypeList, radarConfig.homeSpTypeList);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    @Nullable
    public final List<String> getHomeSpTypeList() {
        return this.homeSpTypeList;
    }

    @Nullable
    public final List<String> getNeuronWhiteList() {
        return this.neuronWhiteList;
    }

    public final int getPackageSize() {
        return this.packageSize;
    }

    @Nullable
    public final List<String> getRegexsList() {
        return this.regexsList;
    }

    @Nullable
    public final List<String> getSpTypeList() {
        return this.spTypeList;
    }

    public final long getTrackExpiredTime() {
        return this.trackExpiredTime;
    }

    public int hashCode() {
        int iA = C3554n0.a(C3554n0.a(z.a(Integer.hashCode(this.packageSize) * 31, 31, this.enable), 31, this.expireTime), 31, this.trackExpiredTime);
        List<String> list = this.spTypeList;
        int iHashCode = 0;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        List<String> list2 = this.neuronWhiteList;
        int iHashCode3 = list2 == null ? 0 : list2.hashCode();
        List<String> list3 = this.regexsList;
        int iHashCode4 = list3 == null ? 0 : list3.hashCode();
        List<String> list4 = this.homeSpTypeList;
        if (list4 != null) {
            iHashCode = list4.hashCode();
        }
        return ((((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    public final void setEnable(boolean z6) {
        this.enable = z6;
    }

    public final void setExpireTime(long j7) {
        this.expireTime = j7;
    }

    public final void setHomeSpTypeList(@Nullable List<String> list) {
        this.homeSpTypeList = list;
    }

    public final void setNeuronWhiteList(@Nullable List<String> list) {
        this.neuronWhiteList = list;
    }

    public final void setPackageSize(int i7) {
        this.packageSize = i7;
    }

    public final void setRegexsList(@Nullable List<String> list) {
        this.regexsList = list;
    }

    public final void setSpTypeList(@Nullable List<String> list) {
        this.spTypeList = list;
    }

    public final void setTrackExpiredTime(long j7) {
        this.trackExpiredTime = j7;
    }

    @NotNull
    public String toString() {
        int i7 = this.packageSize;
        boolean z6 = this.enable;
        long j7 = this.expireTime;
        long j8 = this.trackExpiredTime;
        List<String> list = this.spTypeList;
        List<String> list2 = this.neuronWhiteList;
        List<String> list3 = this.regexsList;
        List<String> list4 = this.homeSpTypeList;
        StringBuilder sbA = c.a(i7, "RadarConfig(packageSize=", ", enable=", ", expireTime=", z6);
        sbA.append(j7);
        J1.z.a(j8, ", trackExpiredTime=", ", spTypeList=", sbA);
        F.c(", neuronWhiteList=", ", regexsList=", sbA, list, list2);
        return C4668j.a(", homeSpTypeList=", ")", sbA, list3, list4);
    }
}
