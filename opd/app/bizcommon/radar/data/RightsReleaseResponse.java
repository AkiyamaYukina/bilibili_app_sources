package com.bilibili.opd.app.bizcommon.radar.data;

import androidx.annotation.Keep;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/data/RightsReleaseResponse.class */
@StabilityInferred(parameters = 0)
@Keep
public final class RightsReleaseResponse {
    public static final int $stable = 8;

    @Nullable
    private MaCouponVO maCouponVO;
    private boolean receiveSuccess;

    @Nullable
    private String toastMessage;

    public RightsReleaseResponse() {
        this(null, false, null, 7, null);
    }

    public RightsReleaseResponse(@Nullable MaCouponVO maCouponVO, boolean z6, @Nullable String str) {
        this.maCouponVO = maCouponVO;
        this.receiveSuccess = z6;
        this.toastMessage = str;
    }

    public /* synthetic */ RightsReleaseResponse(MaCouponVO maCouponVO, boolean z6, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : maCouponVO, (i7 & 2) != 0 ? false : z6, (i7 & 4) != 0 ? null : str);
    }

    public static /* synthetic */ RightsReleaseResponse copy$default(RightsReleaseResponse rightsReleaseResponse, MaCouponVO maCouponVO, boolean z6, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            maCouponVO = rightsReleaseResponse.maCouponVO;
        }
        if ((i7 & 2) != 0) {
            z6 = rightsReleaseResponse.receiveSuccess;
        }
        if ((i7 & 4) != 0) {
            str = rightsReleaseResponse.toastMessage;
        }
        return rightsReleaseResponse.copy(maCouponVO, z6, str);
    }

    @Nullable
    public final MaCouponVO component1() {
        return this.maCouponVO;
    }

    public final boolean component2() {
        return this.receiveSuccess;
    }

    @Nullable
    public final String component3() {
        return this.toastMessage;
    }

    @NotNull
    public final RightsReleaseResponse copy(@Nullable MaCouponVO maCouponVO, boolean z6, @Nullable String str) {
        return new RightsReleaseResponse(maCouponVO, z6, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RightsReleaseResponse)) {
            return false;
        }
        RightsReleaseResponse rightsReleaseResponse = (RightsReleaseResponse) obj;
        return Intrinsics.areEqual(this.maCouponVO, rightsReleaseResponse.maCouponVO) && this.receiveSuccess == rightsReleaseResponse.receiveSuccess && Intrinsics.areEqual(this.toastMessage, rightsReleaseResponse.toastMessage);
    }

    @Nullable
    public final MaCouponVO getMaCouponVO() {
        return this.maCouponVO;
    }

    public final boolean getReceiveSuccess() {
        return this.receiveSuccess;
    }

    @Nullable
    public final String getToastMessage() {
        return this.toastMessage;
    }

    public int hashCode() {
        MaCouponVO maCouponVO = this.maCouponVO;
        int iA = z.a((maCouponVO == null ? 0 : maCouponVO.hashCode()) * 31, 31, this.receiveSuccess);
        String str = this.toastMessage;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final void setMaCouponVO(@Nullable MaCouponVO maCouponVO) {
        this.maCouponVO = maCouponVO;
    }

    public final void setReceiveSuccess(boolean z6) {
        this.receiveSuccess = z6;
    }

    public final void setToastMessage(@Nullable String str) {
        this.toastMessage = str;
    }

    @NotNull
    public String toString() {
        MaCouponVO maCouponVO = this.maCouponVO;
        boolean z6 = this.receiveSuccess;
        String str = this.toastMessage;
        StringBuilder sb = new StringBuilder("RightsReleaseResponse(maCouponVO=");
        sb.append(maCouponVO);
        sb.append(", receiveSuccess=");
        sb.append(z6);
        sb.append(", toastMessage=");
        return C8770a.a(sb, str, ")");
    }
}
