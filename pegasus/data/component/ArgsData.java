package com.bilibili.pegasus.data.component;

import B0.b;
import G0.d;
import H0.e;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.snapshots.z;
import androidx.paging.M;
import com.bilibili.ad.adview.liveroom.answer.fragment.vm.v;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/component/ArgsData.class */
public final class ArgsData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("aid")
    private final long f77327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("up_id")
    private final long f77328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("up_name")
    @Nullable
    private final String f77329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("rid")
    private final long f77330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("rname")
    @Nullable
    private final String f77331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("tid")
    private final long f77332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("tname")
    @Nullable
    private final String f77333g;

    @SerializedName("room_id")
    private final long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("online")
    private final long f77334i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("type")
    private final int f77335j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SerializedName("track_id")
    @Nullable
    private final String f77336k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("state")
    @Nullable
    private final String f77337l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SerializedName("converge_type")
    private final int f77338m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SerializedName("is_follow")
    private int f77339n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @SerializedName("report_extra_info")
    @Nullable
    private final HashMap<String, String> f77340o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @SerializedName("ip_id")
    @Nullable
    private final String f77341p;

    public ArgsData() {
        this(0L, 0L, null, 0L, null, 0L, null, 0L, 0L, 0, null, null, 0, 0, null, null, 65535, null);
    }

    public ArgsData(long j7, long j8, @Nullable String str, long j9, @Nullable String str2, long j10, @Nullable String str3, long j11, long j12, int i7, @Nullable String str4, @Nullable String str5, int i8, int i9, @Nullable HashMap<String, String> map, @Nullable String str6) {
        this.f77327a = j7;
        this.f77328b = j8;
        this.f77329c = str;
        this.f77330d = j9;
        this.f77331e = str2;
        this.f77332f = j10;
        this.f77333g = str3;
        this.h = j11;
        this.f77334i = j12;
        this.f77335j = i7;
        this.f77336k = str4;
        this.f77337l = str5;
        this.f77338m = i8;
        this.f77339n = i9;
        this.f77340o = map;
        this.f77341p = str6;
    }

    public /* synthetic */ ArgsData(long j7, long j8, String str, long j9, String str2, long j10, String str3, long j11, long j12, int i7, String str4, String str5, int i8, int i9, HashMap map, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j7, (i10 & 2) != 0 ? 0L : j8, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? 0L : j9, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? 0L : j10, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? 0L : j11, (i10 & 256) != 0 ? 0L : j12, (i10 & 512) != 0 ? 0 : i7, (i10 & 1024) != 0 ? null : str4, (i10 & 2048) != 0 ? null : str5, (i10 & 4096) != 0 ? 0 : i8, (i10 & 8192) != 0 ? 0 : i9, (i10 & 16384) != 0 ? null : map, (i10 & 32768) != 0 ? null : str6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArgsData copy$default(ArgsData argsData, long j7, long j8, String str, long j9, String str2, long j10, String str3, long j11, long j12, int i7, String str4, String str5, int i8, int i9, HashMap map, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j7 = argsData.f77327a;
        }
        if ((i10 & 2) != 0) {
            j8 = argsData.f77328b;
        }
        if ((i10 & 4) != 0) {
            str = argsData.f77329c;
        }
        if ((i10 & 8) != 0) {
            j9 = argsData.f77330d;
        }
        if ((i10 & 16) != 0) {
            str2 = argsData.f77331e;
        }
        if ((i10 & 32) != 0) {
            j10 = argsData.f77332f;
        }
        if ((i10 & 64) != 0) {
            str3 = argsData.f77333g;
        }
        if ((i10 & 128) != 0) {
            j11 = argsData.h;
        }
        if ((i10 & 256) != 0) {
            j12 = argsData.f77334i;
        }
        if ((i10 & 512) != 0) {
            i7 = argsData.f77335j;
        }
        if ((i10 & 1024) != 0) {
            str4 = argsData.f77336k;
        }
        if ((i10 & 2048) != 0) {
            str5 = argsData.f77337l;
        }
        if ((i10 & 4096) != 0) {
            i8 = argsData.f77338m;
        }
        if ((i10 & 8192) != 0) {
            i9 = argsData.f77339n;
        }
        if ((i10 & 16384) != 0) {
            map = argsData.f77340o;
        }
        if ((i10 & 32768) != 0) {
            str6 = argsData.f77341p;
        }
        return argsData.copy(j7, j8, str, j9, str2, j10, str3, j11, j12, i7, str4, str5, i8, i9, map, str6);
    }

    public final long component1() {
        return this.f77327a;
    }

    public final int component10() {
        return this.f77335j;
    }

    @Nullable
    public final String component11() {
        return this.f77336k;
    }

    @Nullable
    public final String component12() {
        return this.f77337l;
    }

    public final int component13() {
        return this.f77338m;
    }

    public final int component14() {
        return this.f77339n;
    }

    @Nullable
    public final HashMap<String, String> component15() {
        return this.f77340o;
    }

    @Nullable
    public final String component16() {
        return this.f77341p;
    }

    public final long component2() {
        return this.f77328b;
    }

    @Nullable
    public final String component3() {
        return this.f77329c;
    }

    public final long component4() {
        return this.f77330d;
    }

    @Nullable
    public final String component5() {
        return this.f77331e;
    }

    public final long component6() {
        return this.f77332f;
    }

    @Nullable
    public final String component7() {
        return this.f77333g;
    }

    public final long component8() {
        return this.h;
    }

    public final long component9() {
        return this.f77334i;
    }

    @NotNull
    public final ArgsData copy(long j7, long j8, @Nullable String str, long j9, @Nullable String str2, long j10, @Nullable String str3, long j11, long j12, int i7, @Nullable String str4, @Nullable String str5, int i8, int i9, @Nullable HashMap<String, String> map, @Nullable String str6) {
        return new ArgsData(j7, j8, str, j9, str2, j10, str3, j11, j12, i7, str4, str5, i8, i9, map, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArgsData)) {
            return false;
        }
        ArgsData argsData = (ArgsData) obj;
        return this.f77327a == argsData.f77327a && this.f77328b == argsData.f77328b && Intrinsics.areEqual(this.f77329c, argsData.f77329c) && this.f77330d == argsData.f77330d && Intrinsics.areEqual(this.f77331e, argsData.f77331e) && this.f77332f == argsData.f77332f && Intrinsics.areEqual(this.f77333g, argsData.f77333g) && this.h == argsData.h && this.f77334i == argsData.f77334i && this.f77335j == argsData.f77335j && Intrinsics.areEqual(this.f77336k, argsData.f77336k) && Intrinsics.areEqual(this.f77337l, argsData.f77337l) && this.f77338m == argsData.f77338m && this.f77339n == argsData.f77339n && Intrinsics.areEqual(this.f77340o, argsData.f77340o) && Intrinsics.areEqual(this.f77341p, argsData.f77341p);
    }

    public final long getAid() {
        return this.f77327a;
    }

    public final int getConvergeType() {
        return this.f77338m;
    }

    @Nullable
    public final String getIpId() {
        return this.f77341p;
    }

    public final long getOnline() {
        return this.f77334i;
    }

    @Nullable
    public final HashMap<String, String> getReportExtraInfo() {
        return this.f77340o;
    }

    public final long getRid() {
        return this.f77330d;
    }

    @Nullable
    public final String getRname() {
        return this.f77331e;
    }

    public final long getRoomId() {
        return this.h;
    }

    @Nullable
    public final String getState() {
        return this.f77337l;
    }

    public final long getTid() {
        return this.f77332f;
    }

    @Nullable
    public final String getTname() {
        return this.f77333g;
    }

    @Nullable
    public final String getTrackId() {
        return this.f77336k;
    }

    public final int getType() {
        return this.f77335j;
    }

    public final long getUpId() {
        return this.f77328b;
    }

    @Nullable
    public final String getUpName() {
        return this.f77329c;
    }

    public int hashCode() {
        int iA = C3554n0.a(Long.hashCode(this.f77327a) * 31, 31, this.f77328b);
        String str = this.f77329c;
        int iA2 = C3554n0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.f77330d);
        String str2 = this.f77331e;
        int iA3 = C3554n0.a((iA2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f77332f);
        String str3 = this.f77333g;
        int iA4 = I.a(this.f77335j, C3554n0.a(C3554n0.a((iA3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.h), 31, this.f77334i), 31);
        String str4 = this.f77336k;
        int iHashCode = str4 == null ? 0 : str4.hashCode();
        String str5 = this.f77337l;
        int iA5 = I.a(this.f77339n, I.a(this.f77338m, (((iA4 + iHashCode) * 31) + (str5 == null ? 0 : str5.hashCode())) * 31, 31), 31);
        HashMap<String, String> map = this.f77340o;
        int iHashCode2 = map == null ? 0 : map.hashCode();
        String str6 = this.f77341p;
        return ((iA5 + iHashCode2) * 31) + (str6 == null ? 0 : str6.hashCode());
    }

    public final int isFollow() {
        return this.f77339n;
    }

    public final void setFollow(int i7) {
        this.f77339n = i7;
    }

    @NotNull
    public String toString() {
        long j7 = this.f77327a;
        long j8 = this.f77328b;
        String str = this.f77329c;
        long j9 = this.f77330d;
        String str2 = this.f77331e;
        long j10 = this.f77332f;
        String str3 = this.f77333g;
        long j11 = this.h;
        long j12 = this.f77334i;
        int i7 = this.f77335j;
        String str4 = this.f77336k;
        String str5 = this.f77337l;
        int i8 = this.f77338m;
        int i9 = this.f77339n;
        HashMap<String, String> map = this.f77340o;
        String str6 = this.f77341p;
        StringBuilder sbA = z.a(j7, "ArgsData(aid=", ", upId=");
        d.a(j8, ", upName=", str, sbA);
        J1.z.a(j9, ", rid=", ", rname=", sbA);
        v.a(j10, str2, ", tid=", sbA);
        b.b(", tname=", str3, ", roomId=", sbA);
        sbA.append(j11);
        J1.z.a(j12, ", online=", ", type=", sbA);
        M.a(i7, ", trackId=", str4, ", state=", sbA);
        e.b(i8, str5, ", convergeType=", ", isFollow=", sbA);
        sbA.append(i9);
        sbA.append(", reportExtraInfo=");
        sbA.append(map);
        sbA.append(", ipId=");
        return C8770a.a(sbA, str6, ")");
    }
}
