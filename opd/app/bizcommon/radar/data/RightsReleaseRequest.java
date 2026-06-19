package com.bilibili.opd.app.bizcommon.radar.data;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.motion.widget.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/data/RightsReleaseRequest.class */
@StabilityInferred(parameters = 0)
@Keep
public final class RightsReleaseRequest {
    public static final int $stable = 8;

    @NotNull
    private String activityId;

    @NotNull
    private String rightsId;

    public RightsReleaseRequest() {
        this(null, null, 3, null);
    }

    public RightsReleaseRequest(@NotNull String str, @NotNull String str2) {
        this.rightsId = str;
        this.activityId = str2;
    }

    public /* synthetic */ RightsReleaseRequest(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2);
    }

    public static /* synthetic */ RightsReleaseRequest copy$default(RightsReleaseRequest rightsReleaseRequest, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = rightsReleaseRequest.rightsId;
        }
        if ((i7 & 2) != 0) {
            str2 = rightsReleaseRequest.activityId;
        }
        return rightsReleaseRequest.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.rightsId;
    }

    @NotNull
    public final String component2() {
        return this.activityId;
    }

    @NotNull
    public final RightsReleaseRequest copy(@NotNull String str, @NotNull String str2) {
        return new RightsReleaseRequest(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RightsReleaseRequest)) {
            return false;
        }
        RightsReleaseRequest rightsReleaseRequest = (RightsReleaseRequest) obj;
        return Intrinsics.areEqual(this.rightsId, rightsReleaseRequest.rightsId) && Intrinsics.areEqual(this.activityId, rightsReleaseRequest.activityId);
    }

    @NotNull
    public final String getActivityId() {
        return this.activityId;
    }

    @NotNull
    public final String getRightsId() {
        return this.rightsId;
    }

    public int hashCode() {
        return this.activityId.hashCode() + (this.rightsId.hashCode() * 31);
    }

    public final void setActivityId(@NotNull String str) {
        this.activityId = str;
    }

    public final void setRightsId(@NotNull String str) {
        this.rightsId = str;
    }

    @NotNull
    public String toString() {
        return p.a("RightsReleaseRequest(rightsId=", this.rightsId, ", activityId=", this.activityId, ")");
    }
}
