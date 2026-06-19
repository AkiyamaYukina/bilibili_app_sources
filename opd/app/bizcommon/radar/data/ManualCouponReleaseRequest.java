package com.bilibili.opd.app.bizcommon.radar.data;

import G0.b;
import I.E;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import c6.N;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/data/ManualCouponReleaseRequest.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ManualCouponReleaseRequest {
    public static final int $stable = 8;

    @NotNull
    private String activityId;

    @NotNull
    private List<String> couponIds;

    @NotNull
    private String sceneId;

    public ManualCouponReleaseRequest() {
        this(null, null, null, 7, null);
    }

    public ManualCouponReleaseRequest(@NotNull String str, @NotNull String str2, @NotNull List<String> list) {
        this.activityId = str;
        this.sceneId = str2;
        this.couponIds = list;
    }

    public /* synthetic */ ManualCouponReleaseRequest(String str, String str2, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ManualCouponReleaseRequest copy$default(ManualCouponReleaseRequest manualCouponReleaseRequest, String str, String str2, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = manualCouponReleaseRequest.activityId;
        }
        if ((i7 & 2) != 0) {
            str2 = manualCouponReleaseRequest.sceneId;
        }
        if ((i7 & 4) != 0) {
            list = manualCouponReleaseRequest.couponIds;
        }
        return manualCouponReleaseRequest.copy(str, str2, list);
    }

    @NotNull
    public final String component1() {
        return this.activityId;
    }

    @NotNull
    public final String component2() {
        return this.sceneId;
    }

    @NotNull
    public final List<String> component3() {
        return this.couponIds;
    }

    @NotNull
    public final ManualCouponReleaseRequest copy(@NotNull String str, @NotNull String str2, @NotNull List<String> list) {
        return new ManualCouponReleaseRequest(str, str2, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManualCouponReleaseRequest)) {
            return false;
        }
        ManualCouponReleaseRequest manualCouponReleaseRequest = (ManualCouponReleaseRequest) obj;
        return Intrinsics.areEqual(this.activityId, manualCouponReleaseRequest.activityId) && Intrinsics.areEqual(this.sceneId, manualCouponReleaseRequest.sceneId) && Intrinsics.areEqual(this.couponIds, manualCouponReleaseRequest.couponIds);
    }

    @NotNull
    public final String getActivityId() {
        return this.activityId;
    }

    @NotNull
    public final List<String> getCouponIds() {
        return this.couponIds;
    }

    @NotNull
    public final String getSceneId() {
        return this.sceneId;
    }

    public int hashCode() {
        return this.couponIds.hashCode() + E.a(this.activityId.hashCode() * 31, 31, this.sceneId);
    }

    public final void setActivityId(@NotNull String str) {
        this.activityId = str;
    }

    public final void setCouponIds(@NotNull List<String> list) {
        this.couponIds = list;
    }

    public final void setSceneId(@NotNull String str) {
        this.sceneId = str;
    }

    @NotNull
    public String toString() {
        String str = this.activityId;
        String str2 = this.sceneId;
        return N.a(b.a("ManualCouponReleaseRequest(activityId=", str, ", sceneId=", str2, ", couponIds="), ")", this.couponIds);
    }
}
