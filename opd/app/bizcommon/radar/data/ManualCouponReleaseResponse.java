package com.bilibili.opd.app.bizcommon.radar.data;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/data/ManualCouponReleaseResponse.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ManualCouponReleaseResponse {
    public static final int $stable = 8;
    private boolean receiveSuccess;

    @Nullable
    private String toastMessage;

    public ManualCouponReleaseResponse() {
        this(false, null, 3, null);
    }

    public ManualCouponReleaseResponse(boolean z6, @Nullable String str) {
        this.receiveSuccess = z6;
        this.toastMessage = str;
    }

    public /* synthetic */ ManualCouponReleaseResponse(boolean z6, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? false : z6, (i7 & 2) != 0 ? null : str);
    }

    public static /* synthetic */ ManualCouponReleaseResponse copy$default(ManualCouponReleaseResponse manualCouponReleaseResponse, boolean z6, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = manualCouponReleaseResponse.receiveSuccess;
        }
        if ((i7 & 2) != 0) {
            str = manualCouponReleaseResponse.toastMessage;
        }
        return manualCouponReleaseResponse.copy(z6, str);
    }

    public final boolean component1() {
        return this.receiveSuccess;
    }

    @Nullable
    public final String component2() {
        return this.toastMessage;
    }

    @NotNull
    public final ManualCouponReleaseResponse copy(boolean z6, @Nullable String str) {
        return new ManualCouponReleaseResponse(z6, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManualCouponReleaseResponse)) {
            return false;
        }
        ManualCouponReleaseResponse manualCouponReleaseResponse = (ManualCouponReleaseResponse) obj;
        return this.receiveSuccess == manualCouponReleaseResponse.receiveSuccess && Intrinsics.areEqual(this.toastMessage, manualCouponReleaseResponse.toastMessage);
    }

    public final boolean getReceiveSuccess() {
        return this.receiveSuccess;
    }

    @Nullable
    public final String getToastMessage() {
        return this.toastMessage;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.receiveSuccess);
        String str = this.toastMessage;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final void setReceiveSuccess(boolean z6) {
        this.receiveSuccess = z6;
    }

    public final void setToastMessage(@Nullable String str) {
        this.toastMessage = str;
    }

    @NotNull
    public String toString() {
        return n.b("ManualCouponReleaseResponse(receiveSuccess=", ", toastMessage=", this.toastMessage, ")", this.receiveSuccess);
    }
}
