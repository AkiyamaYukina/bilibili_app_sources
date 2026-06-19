package com.bilibili.ship.theseus.united.page.view;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/StatData.class */
@StabilityInferred(parameters = 1)
@Bson
public final class StatData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f104019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StatInfoData f104020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f104021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f104022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f104023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f104024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("vt")
    @NotNull
    private final StatInfoData f104025g;
    public final long h;

    public StatData(long j7, @NotNull StatInfoData statInfoData, long j8, long j9, long j10, long j11, @NotNull StatInfoData statInfoData2, long j12) {
        this.f104019a = j7;
        this.f104020b = statInfoData;
        this.f104021c = j8;
        this.f104022d = j9;
        this.f104023e = j10;
        this.f104024f = j11;
        this.f104025g = statInfoData2;
        this.h = j12;
    }

    public static StatData a(StatData statData, long j7, long j8, long j9, long j10, long j11, int i7) {
        if ((i7 & 1) != 0) {
            j7 = statData.f104019a;
        }
        StatInfoData statInfoData = statData.f104020b;
        if ((i7 & 4) != 0) {
            j8 = statData.f104021c;
        }
        if ((i7 & 8) != 0) {
            j9 = statData.f104022d;
        }
        if ((i7 & 16) != 0) {
            j10 = statData.f104023e;
        }
        if ((i7 & 32) != 0) {
            j11 = statData.f104024f;
        }
        StatInfoData statInfoData2 = statData.f104025g;
        long j12 = statData.h;
        statData.getClass();
        return new StatData(j7, statInfoData, j8, j9, j10, j11, statInfoData2, j12);
    }

    @NotNull
    public final StatInfoData b() {
        return this.f104025g;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatData)) {
            return false;
        }
        StatData statData = (StatData) obj;
        return this.f104019a == statData.f104019a && Intrinsics.areEqual(this.f104020b, statData.f104020b) && this.f104021c == statData.f104021c && this.f104022d == statData.f104022d && this.f104023e == statData.f104023e && this.f104024f == statData.f104024f && Intrinsics.areEqual(this.f104025g, statData.f104025g) && this.h == statData.h;
    }

    public final int hashCode() {
        int iA = C3554n0.a(C3554n0.a(C3554n0.a(C3554n0.a((this.f104020b.hashCode() + (Long.hashCode(this.f104019a) * 31)) * 31, 31, this.f104021c), 31, this.f104022d), 31, this.f104023e), 31, this.f104024f);
        return Long.hashCode(this.h) + ((this.f104025g.hashCode() + iA) * 31);
    }

    @NotNull
    public final String toString() {
        StatInfoData statInfoData = this.f104025g;
        StringBuilder sb = new StringBuilder("StatData(coin=");
        sb.append(this.f104019a);
        sb.append(", danmaku=");
        sb.append(this.f104020b);
        sb.append(", fav=");
        sb.append(this.f104021c);
        sb.append(", like=");
        sb.append(this.f104022d);
        sb.append(", reply=");
        sb.append(this.f104023e);
        sb.append(", share=");
        sb.append(this.f104024f);
        sb.append(", viewTime=");
        sb.append(statInfoData);
        sb.append(", follow=");
        return android.support.v4.media.session.a.a(sb, this.h, ")");
    }
}
