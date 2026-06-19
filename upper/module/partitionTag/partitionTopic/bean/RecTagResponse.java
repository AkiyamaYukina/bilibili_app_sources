package com.bilibili.upper.module.partitionTag.partitionTopic.bean;

import Di0.C1600d;
import N1.o;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.upper.api.bean.archive.UpperRcmdTagBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/bean/RecTagResponse.class */
@StabilityInferred(parameters = 0)
@Keep
public final class RecTagResponse {
    public static final int $stable = 8;

    @Nullable
    private List<? extends UpperRcmdTagBean> data;

    @Nullable
    private final String errorMsg;

    @Nullable
    private final String requestId;
    private final boolean success;

    public RecTagResponse(boolean z6, @Nullable String str, @Nullable String str2, @Nullable List<? extends UpperRcmdTagBean> list) {
        this.success = z6;
        this.errorMsg = str;
        this.requestId = str2;
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecTagResponse copy$default(RecTagResponse recTagResponse, boolean z6, String str, String str2, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = recTagResponse.success;
        }
        if ((i7 & 2) != 0) {
            str = recTagResponse.errorMsg;
        }
        if ((i7 & 4) != 0) {
            str2 = recTagResponse.requestId;
        }
        if ((i7 & 8) != 0) {
            list = recTagResponse.data;
        }
        return recTagResponse.copy(z6, str, str2, list);
    }

    public final boolean component1() {
        return this.success;
    }

    @Nullable
    public final String component2() {
        return this.errorMsg;
    }

    @Nullable
    public final String component3() {
        return this.requestId;
    }

    @Nullable
    public final List<UpperRcmdTagBean> component4() {
        return this.data;
    }

    @NotNull
    public final RecTagResponse copy(boolean z6, @Nullable String str, @Nullable String str2, @Nullable List<? extends UpperRcmdTagBean> list) {
        return new RecTagResponse(z6, str, str2, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecTagResponse)) {
            return false;
        }
        RecTagResponse recTagResponse = (RecTagResponse) obj;
        return this.success == recTagResponse.success && Intrinsics.areEqual(this.errorMsg, recTagResponse.errorMsg) && Intrinsics.areEqual(this.requestId, recTagResponse.requestId) && Intrinsics.areEqual(this.data, recTagResponse.data);
    }

    @Nullable
    public final List<UpperRcmdTagBean> getData() {
        return this.data;
    }

    @Nullable
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @Nullable
    public final String getRequestId() {
        return this.requestId;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success);
        String str = this.errorMsg;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.requestId;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        List<? extends UpperRcmdTagBean> list = this.data;
        if (list != null) {
            iHashCode2 = list.hashCode();
        }
        return (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2;
    }

    public final void setData(@Nullable List<? extends UpperRcmdTagBean> list) {
        this.data = list;
    }

    @NotNull
    public String toString() {
        boolean z6 = this.success;
        String str = this.errorMsg;
        return o.a(this.requestId, ", data=", ")", C1600d.b("RecTagResponse(success=", ", errorMsg=", str, ", requestId=", z6), this.data);
    }
}
