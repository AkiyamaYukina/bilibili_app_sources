package com.bilibili.opd.app.bizcommon.malldynamic.core;

import androidx.annotation.Keep;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/malldynamic/core/DynamicErrorList.class */
@Keep
public final class DynamicErrorList {

    @Nullable
    private Integer errorCode;

    @Nullable
    private String errorMsg;

    public DynamicErrorList() {
        this(null, null, 3, null);
    }

    public DynamicErrorList(@Nullable String str, @Nullable Integer num) {
        this.errorMsg = str;
        this.errorCode = num;
    }

    public /* synthetic */ DynamicErrorList(String str, Integer num, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? 0 : num);
    }

    public static /* synthetic */ DynamicErrorList copy$default(DynamicErrorList dynamicErrorList, String str, Integer num, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = dynamicErrorList.errorMsg;
        }
        if ((i7 & 2) != 0) {
            num = dynamicErrorList.errorCode;
        }
        return dynamicErrorList.copy(str, num);
    }

    @Nullable
    public final String component1() {
        return this.errorMsg;
    }

    @Nullable
    public final Integer component2() {
        return this.errorCode;
    }

    @NotNull
    public final DynamicErrorList copy(@Nullable String str, @Nullable Integer num) {
        return new DynamicErrorList(str, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicErrorList)) {
            return false;
        }
        DynamicErrorList dynamicErrorList = (DynamicErrorList) obj;
        return Intrinsics.areEqual(this.errorMsg, dynamicErrorList.errorMsg) && Intrinsics.areEqual(this.errorCode, dynamicErrorList.errorCode);
    }

    @Nullable
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public int hashCode() {
        String str = this.errorMsg;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.errorCode;
        if (num != null) {
            iHashCode = num.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final void setErrorCode(@Nullable Integer num) {
        this.errorCode = num;
    }

    public final void setErrorMsg(@Nullable String str) {
        this.errorMsg = str;
    }

    @NotNull
    public String toString() {
        return "DynamicErrorList(errorMsg=" + this.errorMsg + ", errorCode=" + this.errorCode + ")";
    }
}
