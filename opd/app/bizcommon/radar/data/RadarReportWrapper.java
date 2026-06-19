package com.bilibili.opd.app.bizcommon.radar.data;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.analytics.C;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/data/RadarReportWrapper.class */
@StabilityInferred(parameters = 0)
@Keep
public final class RadarReportWrapper {
    public static final int $stable = 8;

    @NotNull
    private List<RadarReportEvent> eventList;

    @NotNull
    private String imei;

    public RadarReportWrapper(@NotNull String str, @NotNull List<RadarReportEvent> list) {
        this.imei = str;
        this.eventList = list;
    }

    public /* synthetic */ RadarReportWrapper(String str, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RadarReportWrapper copy$default(RadarReportWrapper radarReportWrapper, String str, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = radarReportWrapper.imei;
        }
        if ((i7 & 2) != 0) {
            list = radarReportWrapper.eventList;
        }
        return radarReportWrapper.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.imei;
    }

    @NotNull
    public final List<RadarReportEvent> component2() {
        return this.eventList;
    }

    @NotNull
    public final RadarReportWrapper copy(@NotNull String str, @NotNull List<RadarReportEvent> list) {
        return new RadarReportWrapper(str, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadarReportWrapper)) {
            return false;
        }
        RadarReportWrapper radarReportWrapper = (RadarReportWrapper) obj;
        return Intrinsics.areEqual(this.imei, radarReportWrapper.imei) && Intrinsics.areEqual(this.eventList, radarReportWrapper.eventList);
    }

    @NotNull
    public final List<RadarReportEvent> getEventList() {
        return this.eventList;
    }

    @NotNull
    public final String getImei() {
        return this.imei;
    }

    public int hashCode() {
        return this.eventList.hashCode() + (this.imei.hashCode() * 31);
    }

    public final void setEventList(@NotNull List<RadarReportEvent> list) {
        this.eventList = list;
    }

    public final void setImei(@NotNull String str) {
        this.imei = str;
    }

    @NotNull
    public String toString() {
        return C.a("RadarReportWrapper(imei=", this.imei, ", eventList=", ")", this.eventList);
    }
}
