package com.bilibili.upper.module.uppercenter.datacenter;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import bilibili.live.app.service.resolver.a;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/datacenter/LimitInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class LimitInfo {
    public static final int $stable = 8;

    @JSONField(name = "limit_reason")
    @Nullable
    private String limitReason;

    @JSONField(name = "limit_state")
    private int limitState;

    @JSONField(name = "limit_url")
    @Nullable
    private String limitUrl;

    public LimitInfo() {
        this(0, null, null, 7, null);
    }

    public LimitInfo(int i7, @Nullable String str, @Nullable String str2) {
        this.limitState = i7;
        this.limitReason = str;
        this.limitUrl = str2;
    }

    public /* synthetic */ LimitInfo(int i7, String str, String str2, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i7, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : str2);
    }

    public static /* synthetic */ LimitInfo copy$default(LimitInfo limitInfo, int i7, String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = limitInfo.limitState;
        }
        if ((i8 & 2) != 0) {
            str = limitInfo.limitReason;
        }
        if ((i8 & 4) != 0) {
            str2 = limitInfo.limitUrl;
        }
        return limitInfo.copy(i7, str, str2);
    }

    public final int component1() {
        return this.limitState;
    }

    @Nullable
    public final String component2() {
        return this.limitReason;
    }

    @Nullable
    public final String component3() {
        return this.limitUrl;
    }

    @NotNull
    public final LimitInfo copy(int i7, @Nullable String str, @Nullable String str2) {
        return new LimitInfo(i7, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitInfo)) {
            return false;
        }
        LimitInfo limitInfo = (LimitInfo) obj;
        return this.limitState == limitInfo.limitState && Intrinsics.areEqual(this.limitReason, limitInfo.limitReason) && Intrinsics.areEqual(this.limitUrl, limitInfo.limitUrl);
    }

    @Nullable
    public final String getLimitReason() {
        return this.limitReason;
    }

    public final int getLimitState() {
        return this.limitState;
    }

    @Nullable
    public final String getLimitUrl() {
        return this.limitUrl;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.limitState);
        String str = this.limitReason;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.limitUrl;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    public final void setLimitReason(@Nullable String str) {
        this.limitReason = str;
    }

    public final void setLimitState(int i7) {
        this.limitState = i7;
    }

    public final void setLimitUrl(@Nullable String str) {
        this.limitUrl = str;
    }

    @NotNull
    public String toString() {
        int i7 = this.limitState;
        String str = this.limitReason;
        return C8770a.a(a.b(i7, "LimitInfo(limitState=", ", limitReason=", str, ", limitUrl="), this.limitUrl, ")");
    }
}
