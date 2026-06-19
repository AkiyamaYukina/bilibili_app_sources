package com.bilibili.ship.theseus.united.page.intro.module.season;

import I1.C2157f0;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.C4690e;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonActivity.class */
@StabilityInferred(parameters = 1)
@Bson
public final class UnitedSeasonActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("type")
    private final int f101509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("oid")
    private final long f101510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("activity_id")
    private final long f101511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("title")
    @NotNull
    private final String f101512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("intro")
    @NotNull
    private final String f101513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("day_count")
    private final int f101514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("user_count")
    private final int f101515g;

    @SerializedName("join_deadline")
    private final long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("activity_deadline")
    private final long f101516i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("checkin_view_time")
    private final int f101517j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SerializedName("new_activity")
    private final boolean f101518k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("user_activity")
    @NotNull
    private final UnitedSeasonUserActivity f101519l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SerializedName("season_show")
    @NotNull
    private final UnitedActivitySeasonShow f101520m;

    public UnitedSeasonActivity(int i7, long j7, long j8, @NotNull String str, @NotNull String str2, int i8, int i9, long j9, long j10, int i10, boolean z6, @NotNull UnitedSeasonUserActivity unitedSeasonUserActivity, @NotNull UnitedActivitySeasonShow unitedActivitySeasonShow) {
        this.f101509a = i7;
        this.f101510b = j7;
        this.f101511c = j8;
        this.f101512d = str;
        this.f101513e = str2;
        this.f101514f = i8;
        this.f101515g = i9;
        this.h = j9;
        this.f101516i = j10;
        this.f101517j = i10;
        this.f101518k = z6;
        this.f101519l = unitedSeasonUserActivity;
        this.f101520m = unitedActivitySeasonShow;
    }

    public final long a() {
        return this.f101516i;
    }

    public final long b() {
        return this.f101511c;
    }

    public final int c() {
        return this.f101517j;
    }

    public final int d() {
        return this.f101514f;
    }

    @NotNull
    public final String e() {
        return this.f101513e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnitedSeasonActivity)) {
            return false;
        }
        UnitedSeasonActivity unitedSeasonActivity = (UnitedSeasonActivity) obj;
        return this.f101509a == unitedSeasonActivity.f101509a && this.f101510b == unitedSeasonActivity.f101510b && this.f101511c == unitedSeasonActivity.f101511c && Intrinsics.areEqual(this.f101512d, unitedSeasonActivity.f101512d) && Intrinsics.areEqual(this.f101513e, unitedSeasonActivity.f101513e) && this.f101514f == unitedSeasonActivity.f101514f && this.f101515g == unitedSeasonActivity.f101515g && this.h == unitedSeasonActivity.h && this.f101516i == unitedSeasonActivity.f101516i && this.f101517j == unitedSeasonActivity.f101517j && this.f101518k == unitedSeasonActivity.f101518k && Intrinsics.areEqual(this.f101519l, unitedSeasonActivity.f101519l) && Intrinsics.areEqual(this.f101520m, unitedSeasonActivity.f101520m);
    }

    public final long f() {
        return this.h;
    }

    public final boolean g() {
        return this.f101518k;
    }

    public final long h() {
        return this.f101510b;
    }

    public final int hashCode() {
        int iA = androidx.compose.animation.z.a(androidx.compose.animation.core.I.a(this.f101517j, C3554n0.a(C3554n0.a(androidx.compose.animation.core.I.a(this.f101515g, androidx.compose.animation.core.I.a(this.f101514f, I.E.a(I.E.a(C3554n0.a(C3554n0.a(Integer.hashCode(this.f101509a) * 31, 31, this.f101510b), 31, this.f101511c), 31, this.f101512d), 31, this.f101513e), 31), 31), 31, this.h), 31, this.f101516i), 31), 31, this.f101518k);
        return this.f101520m.hashCode() + ((this.f101519l.hashCode() + iA) * 31);
    }

    @NotNull
    public final UnitedActivitySeasonShow i() {
        return this.f101520m;
    }

    @NotNull
    public final String j() {
        return this.f101512d;
    }

    public final int k() {
        return this.f101509a;
    }

    @NotNull
    public final UnitedSeasonUserActivity l() {
        return this.f101519l;
    }

    public final int m() {
        return this.f101515g;
    }

    @NotNull
    public final String toString() {
        int i7 = this.f101509a;
        long j7 = this.f101510b;
        long j8 = this.f101511c;
        String str = this.f101512d;
        String str2 = this.f101513e;
        int i8 = this.f101514f;
        int i9 = this.f101515g;
        long j9 = this.h;
        long j10 = this.f101516i;
        int i10 = this.f101517j;
        boolean z6 = this.f101518k;
        UnitedSeasonUserActivity unitedSeasonUserActivity = this.f101519l;
        UnitedActivitySeasonShow unitedActivitySeasonShow = this.f101520m;
        StringBuilder sbA = C2157f0.a(i7, j7, "UnitedSeasonActivity(type=", ", oid=");
        J1.z.a(j8, ", activityId=", ", title=", sbA);
        androidx.room.B.a(str, ", intro=", str2, ", dayCount=", sbA);
        C4690e.a(i8, i9, ", userCount=", ", joinDeadLine=", sbA);
        sbA.append(j9);
        J1.z.a(j10, ", activityDeadline=", ", checkInViewTime=", sbA);
        z4.d.a(", newActivity=", ", userActivity=", i10, z6, sbA);
        sbA.append(unitedSeasonUserActivity);
        sbA.append(", seasonShow=");
        sbA.append(unitedActivitySeasonShow);
        sbA.append(")");
        return sbA.toString();
    }
}
