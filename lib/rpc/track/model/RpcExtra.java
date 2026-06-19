package com.bilibili.lib.rpc.track.model;

import I.E;
import a5.C3188c;
import androidx.compose.animation.z;
import androidx.fragment.app.A;
import androidx.room.B;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.mobile.BLHumanActionParamsType;
import java.util.UUID;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/RpcExtra.class */
public final class RpcExtra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Tunnel f64370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f64371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f64372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f64373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public RpcSample f64374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f64375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f64376g;

    @NotNull
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public String f64377i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public String f64378j;

    @JvmOverloads
    public RpcExtra(@NotNull Tunnel tunnel) {
        this(tunnel, null, false, false, null, null, null, null, null, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_MAX_SIZE, null);
    }

    @JvmOverloads
    public RpcExtra(@NotNull Tunnel tunnel, @NotNull String str) {
        this(tunnel, str, false, false, null, null, null, null, null, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_SEGMENT_RESULT_BLUR, null);
    }

    @JvmOverloads
    public RpcExtra(@NotNull Tunnel tunnel, @NotNull String str, boolean z6) {
        this(tunnel, str, z6, false, null, null, null, null, null, 504, null);
    }

    @JvmOverloads
    public RpcExtra(@NotNull Tunnel tunnel, @NotNull String str, boolean z6, boolean z7) {
        this(tunnel, str, z6, z7, null, null, null, null, null, 496, null);
    }

    @JvmOverloads
    public RpcExtra(@NotNull Tunnel tunnel, @NotNull String str, boolean z6, boolean z7, @Nullable RpcSample rpcSample) {
        this(tunnel, str, z6, z7, rpcSample, null, null, null, null, WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, null);
    }

    @JvmOverloads
    public RpcExtra(@NotNull Tunnel tunnel, @NotNull String str, boolean z6, boolean z7, @Nullable RpcSample rpcSample, @Nullable String str2) {
        this(tunnel, str, z6, z7, rpcSample, str2, null, null, null, 448, null);
    }

    @JvmOverloads
    public RpcExtra(@NotNull Tunnel tunnel, @NotNull String str, boolean z6, boolean z7, @Nullable RpcSample rpcSample, @Nullable String str2, @Nullable String str3) {
        this(tunnel, str, z6, z7, rpcSample, str2, str3, null, null, 384, null);
    }

    @JvmOverloads
    public RpcExtra(@NotNull Tunnel tunnel, @NotNull String str, boolean z6, boolean z7, @Nullable RpcSample rpcSample, @Nullable String str2, @Nullable String str3, @NotNull String str4) {
        this(tunnel, str, z6, z7, rpcSample, str2, str3, str4, null, 256, null);
    }

    @JvmOverloads
    public RpcExtra(@NotNull Tunnel tunnel, @NotNull String str, boolean z6, boolean z7, @Nullable RpcSample rpcSample, @Nullable String str2, @Nullable String str3, @NotNull String str4, @NotNull String str5) {
        this.f64370a = tunnel;
        this.f64371b = str;
        this.f64372c = z6;
        this.f64373d = z7;
        this.f64374e = rpcSample;
        this.f64375f = str2;
        this.f64376g = str3;
        this.h = str4;
        this.f64377i = str5;
        this.f64378j = "";
    }

    public /* synthetic */ RpcExtra(Tunnel tunnel, String str, boolean z6, boolean z7, RpcSample rpcSample, String str2, String str3, String str4, String str5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(tunnel, (i7 & 2) != 0 ? UUID.randomUUID().toString() : str, (i7 & 4) != 0 ? false : z6, (i7 & 8) != 0 ? false : z7, (i7 & 16) != 0 ? null : rpcSample, (i7 & 32) != 0 ? null : str2, (i7 & 64) != 0 ? null : str3, (i7 & 128) != 0 ? "" : str4, (i7 & 256) != 0 ? "" : str5);
    }

    public static /* synthetic */ RpcExtra copy$default(RpcExtra rpcExtra, Tunnel tunnel, String str, boolean z6, boolean z7, RpcSample rpcSample, String str2, String str3, String str4, String str5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            tunnel = rpcExtra.f64370a;
        }
        if ((i7 & 2) != 0) {
            str = rpcExtra.f64371b;
        }
        if ((i7 & 4) != 0) {
            z6 = rpcExtra.f64372c;
        }
        if ((i7 & 8) != 0) {
            z7 = rpcExtra.f64373d;
        }
        if ((i7 & 16) != 0) {
            rpcSample = rpcExtra.f64374e;
        }
        if ((i7 & 32) != 0) {
            str2 = rpcExtra.f64375f;
        }
        if ((i7 & 64) != 0) {
            str3 = rpcExtra.f64376g;
        }
        if ((i7 & 128) != 0) {
            str4 = rpcExtra.h;
        }
        if ((i7 & 256) != 0) {
            str5 = rpcExtra.f64377i;
        }
        return rpcExtra.copy(tunnel, str, z6, z7, rpcSample, str2, str3, str4, str5);
    }

    @NotNull
    public final Tunnel component1() {
        return this.f64370a;
    }

    @NotNull
    public final String component2() {
        return this.f64371b;
    }

    public final boolean component3() {
        return this.f64372c;
    }

    public final boolean component4() {
        return this.f64373d;
    }

    @Nullable
    public final RpcSample component5() {
        return this.f64374e;
    }

    @Nullable
    public final String component6() {
        return this.f64375f;
    }

    @Nullable
    public final String component7() {
        return this.f64376g;
    }

    @NotNull
    public final String component8() {
        return this.h;
    }

    @NotNull
    public final String component9() {
        return this.f64377i;
    }

    @NotNull
    public final RpcExtra copy(@NotNull Tunnel tunnel, @NotNull String str, boolean z6, boolean z7, @Nullable RpcSample rpcSample, @Nullable String str2, @Nullable String str3, @NotNull String str4, @NotNull String str5) {
        return new RpcExtra(tunnel, str, z6, z7, rpcSample, str2, str3, str4, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RpcExtra)) {
            return false;
        }
        RpcExtra rpcExtra = (RpcExtra) obj;
        return this.f64370a == rpcExtra.f64370a && Intrinsics.areEqual(this.f64371b, rpcExtra.f64371b) && this.f64372c == rpcExtra.f64372c && this.f64373d == rpcExtra.f64373d && Intrinsics.areEqual(this.f64374e, rpcExtra.f64374e) && Intrinsics.areEqual(this.f64375f, rpcExtra.f64375f) && Intrinsics.areEqual(this.f64376g, rpcExtra.f64376g) && Intrinsics.areEqual(this.h, rpcExtra.h) && Intrinsics.areEqual(this.f64377i, rpcExtra.f64377i);
    }

    public final boolean getDowngrade() {
        return this.f64372c;
    }

    @Nullable
    public final String getLogicalUrl() {
        return this.f64375f;
    }

    @Nullable
    public final String getMethod() {
        return this.f64376g;
    }

    public final boolean getPersistent() {
        return this.f64373d;
    }

    @Nullable
    public final RpcSample getSample() {
        return this.f64374e;
    }

    @NotNull
    public final String getTraceId() {
        return this.f64371b;
    }

    @NotNull
    public final Tunnel getTunnel() {
        return this.f64370a;
    }

    @NotNull
    public final String getXBiliTicket() {
        return this.f64378j;
    }

    @NotNull
    public final String getXtraceId() {
        return this.h;
    }

    @NotNull
    public final String getZone() {
        return this.f64377i;
    }

    public int hashCode() {
        int iA = z.a(z.a(E.a(this.f64370a.hashCode() * 31, 31, this.f64371b), 31, this.f64372c), 31, this.f64373d);
        RpcSample rpcSample = this.f64374e;
        int iHashCode = 0;
        int iHashCode2 = rpcSample == null ? 0 : rpcSample.hashCode();
        String str = this.f64375f;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.f64376g;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return this.f64377i.hashCode() + E.a((((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode) * 31, 31, this.h);
    }

    public final void setDowngrade(boolean z6) {
        this.f64372c = z6;
    }

    public final void setLogicalUrl(@Nullable String str) {
        this.f64375f = str;
    }

    public final void setMethod(@Nullable String str) {
        this.f64376g = str;
    }

    public final void setPersistent(boolean z6) {
        this.f64373d = z6;
    }

    public final void setSample(@Nullable RpcSample rpcSample) {
        this.f64374e = rpcSample;
    }

    public final void setTunnel(@NotNull Tunnel tunnel) {
        this.f64370a = tunnel;
    }

    public final void setXBiliTicket(@NotNull String str) {
        this.f64378j = str;
    }

    public final void setZone(@NotNull String str) {
        this.f64377i = str;
    }

    @NotNull
    public String toString() {
        Tunnel tunnel = this.f64370a;
        boolean z6 = this.f64372c;
        boolean z7 = this.f64373d;
        RpcSample rpcSample = this.f64374e;
        String str = this.f64375f;
        String str2 = this.f64376g;
        String str3 = this.f64377i;
        StringBuilder sb = new StringBuilder("RpcExtra(tunnel=");
        sb.append(tunnel);
        sb.append(", traceId=");
        C3188c.a(this.f64371b, ", downgrade=", ", persistent=", sb, z6);
        sb.append(z7);
        sb.append(", sample=");
        sb.append(rpcSample);
        sb.append(", logicalUrl=");
        B.a(str, ", method=", str2, ", xtraceId=", sb);
        return A.a(this.h, ", zone=", str3, ")", sb);
    }
}
