package com.bilibili.ogv.opbase;

import I.E;
import J1.z;
import android.support.v4.media.session.a;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/CountInfo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class CountInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f69817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f69818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(IVideoLikeRouteService.ACTION_LIKE)
    private long f69819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("follow_view")
    @NotNull
    private String f69820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f69821e;

    public CountInfo() {
        this(0L, 0L, null, 0L, 31, 0L);
    }

    public CountInfo(long j7, long j8, String str, long j9, int i7, long j10) {
        j7 = (i7 & 1) != 0 ? 0L : j7;
        j8 = (i7 & 2) != 0 ? 0L : j8;
        j9 = (i7 & 4) != 0 ? 0L : j9;
        str = (i7 & 8) != 0 ? "" : str;
        j10 = (i7 & 16) != 0 ? 0L : j10;
        this.f69817a = j7;
        this.f69818b = j8;
        this.f69819c = j9;
        this.f69820d = str;
        this.f69821e = j10;
    }

    @NotNull
    public final String a() {
        return this.f69820d;
    }

    public final long b() {
        return this.f69819c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountInfo)) {
            return false;
        }
        CountInfo countInfo = (CountInfo) obj;
        return this.f69817a == countInfo.f69817a && this.f69818b == countInfo.f69818b && this.f69819c == countInfo.f69819c && Intrinsics.areEqual(this.f69820d, countInfo.f69820d) && this.f69821e == countInfo.f69821e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f69821e) + E.a(C3554n0.a(C3554n0.a(Long.hashCode(this.f69817a) * 31, 31, this.f69818b), 31, this.f69819c), 31, this.f69820d);
    }

    @NotNull
    public final String toString() {
        long j7 = this.f69819c;
        String str = this.f69820d;
        StringBuilder sb = new StringBuilder("CountInfo(view=");
        sb.append(this.f69817a);
        sb.append(", danmaku=");
        sb.append(this.f69818b);
        z.a(j7, ", likeNum=", ", followView=", sb);
        sb.append(str);
        sb.append(", follow=");
        return a.a(sb, this.f69821e, ")");
    }
}
