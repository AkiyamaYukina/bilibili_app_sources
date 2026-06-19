package com.bilibili.lib.projection.commonburid;

import De0.C1572e;
import android.os.Build;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.base.BiliContext;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.foundation.FoundationAlias;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.ExceptionsKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/commonburid/CastCommonParameters.class */
public final class CastCommonParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f62983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public CastEnterSource f62984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public CastContentType f62985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public CastPanelSearchState f62986d = CastPanelSearchState.CastPanelSearchStateUnknown;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public CastScreenType f62987e = CastScreenType.CastScreenTypeUnknown;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f62988f = FoundationAlias.getFapps().getVersionName();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f62989g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f62990i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public CastNetworkType f62991j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f62992k;

    public CastCommonParameters(@NotNull String str, @NotNull CastEnterSource castEnterSource, @NotNull CastContentType castContentType) {
        this.f62983a = str;
        this.f62984b = castEnterSource;
        this.f62985c = castContentType;
        String str2 = Build.VERSION.RELEASE;
        this.f62989g = str2 == null ? "" : str2;
        this.h = o.b();
        this.f62990i = Constant.SDK_OS;
        this.f62991j = CastNetworkType.CastNetworkTypeUNKNOWN;
        this.f62992k = UUID.randomUUID().toString();
    }

    public static /* synthetic */ CastCommonParameters copy$default(CastCommonParameters castCommonParameters, String str, CastEnterSource castEnterSource, CastContentType castContentType, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = castCommonParameters.f62983a;
        }
        if ((i7 & 2) != 0) {
            castEnterSource = castCommonParameters.f62984b;
        }
        if ((i7 & 4) != 0) {
            castContentType = castCommonParameters.f62985c;
        }
        return castCommonParameters.copy(str, castEnterSource, castContentType);
    }

    @NotNull
    public final String component1() {
        return this.f62983a;
    }

    @NotNull
    public final CastEnterSource component2() {
        return this.f62984b;
    }

    @NotNull
    public final CastContentType component3() {
        return this.f62985c;
    }

    @NotNull
    public final CastCommonParameters copy(@NotNull String str, @NotNull CastEnterSource castEnterSource, @NotNull CastContentType castContentType) {
        return new CastCommonParameters(str, castEnterSource, castContentType);
    }

    @NotNull
    public final CastPanelSearchState currentPanelState() {
        CastPanelSearchState castPanelSearchState;
        synchronized (this) {
            castPanelSearchState = this.f62986d;
        }
        return castPanelSearchState;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CastCommonParameters)) {
            return false;
        }
        CastCommonParameters castCommonParameters = (CastCommonParameters) obj;
        return Intrinsics.areEqual(this.f62983a, castCommonParameters.f62983a) && this.f62984b == castCommonParameters.f62984b && this.f62985c == castCommonParameters.f62985c;
    }

    @NotNull
    public final String getContentId() {
        return this.f62983a;
    }

    @NotNull
    public final CastContentType getContentType() {
        return this.f62985c;
    }

    @NotNull
    public final CastScreenType getCurrentScreenCastType() {
        return this.f62987e;
    }

    @NotNull
    public final String getCurrentScreencastSessionId() {
        return this.f62992k;
    }

    @NotNull
    public final CastEnterSource getEnterSource() {
        return this.f62984b;
    }

    public int hashCode() {
        int iHashCode = this.f62983a.hashCode();
        return this.f62985c.hashCode() + ((this.f62984b.hashCode() + (iHashCode * 31)) * 31);
    }

    public final void setContentId(@NotNull String str) {
        this.f62983a = str;
    }

    public final void setContentType(@NotNull CastContentType castContentType) {
        this.f62985c = castContentType;
    }

    public final void setEnterSource(@NotNull CastEnterSource castEnterSource) {
        this.f62984b = castEnterSource;
    }

    @NotNull
    public final Map<String, String> toMap() {
        Map<String, String> mapMapOf;
        synchronized (this) {
            this.h = BiliAccounts.get(BiliContext.application()).isLogin();
            this.f62991j = ConnectivityMonitor.getInstance().isWifiActive() ? CastNetworkType.CastNetworkTypeWIFI : ConnectivityMonitor.getInstance().isMobileActive() ? CastNetworkType.CastNetworkTypeCELLULAR : CastNetworkType.CastNetworkTypeUNKNOWN;
            String.valueOf(this.f62987e);
            Pair pair = TuplesKt.to("screencast_session_id", this.f62992k);
            Pair pair2 = TuplesKt.to("enter_source", this.f62984b.getRawValue());
            Pair pair3 = TuplesKt.to("screencast_type", this.f62987e.getRawValue());
            Pair pair4 = TuplesKt.to("client_platform", this.f62990i);
            Pair pair5 = TuplesKt.to("os_version", this.f62989g);
            Pair pair6 = TuplesKt.to("client_version", this.f62988f);
            Pair pair7 = TuplesKt.to("network_type", this.f62991j.getRawValue());
            Pair pair8 = TuplesKt.to("panel_state", this.f62986d.getRawValue());
            Pair pair9 = TuplesKt.to("content_type", this.f62985c.getRawValue());
            Pair pair10 = TuplesKt.to("content_id", this.f62983a);
            Pair pair11 = TuplesKt.to("is_login", this.h ? "1" : "0");
            C1572e.f2836a.getClass();
            mapMapOf = MapsKt.mapOf(new Pair[]{pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, TuplesKt.to("yst_offline_counts", String.valueOf(C1572e.f2837b))});
        }
        return mapMapOf;
    }

    @NotNull
    public String toString() {
        return "CastCommonParameters(contentId=" + this.f62983a + ", enterSource=" + this.f62984b + ", contentType=" + this.f62985c + ")";
    }

    public final void updateContentId(@NotNull String str) {
        synchronized (this) {
            this.f62983a = str;
        }
    }

    public final void updateContentType(@NotNull CastContentType castContentType) {
        synchronized (this) {
            this.f62985c = castContentType;
        }
    }

    public final void updateEnterSource(@NotNull CastEnterSource castEnterSource) {
        synchronized (this) {
            this.f62984b = castEnterSource;
        }
    }

    public final void updatePanelSearchState(@NotNull CastPanelSearchState castPanelSearchState) {
        synchronized (this) {
            this.f62986d = castPanelSearchState;
        }
    }

    public final void updateScreenCastType(@NotNull CastScreenType castScreenType) {
        synchronized (this) {
            ExceptionsKt.stackTraceToString(new Exception());
            Objects.toString(castScreenType);
            this.f62987e = castScreenType;
        }
    }
}
