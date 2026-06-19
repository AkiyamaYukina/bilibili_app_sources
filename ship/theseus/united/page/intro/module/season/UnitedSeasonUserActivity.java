package com.bilibili.ship.theseus.united.page.intro.module.season;

import I1.C2157f0;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonUserActivity.class */
@StabilityInferred(parameters = 1)
@Bson
public final class UnitedSeasonUserActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("user_state")
    private final int f101625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("last_checkin_date")
    private final long f101626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("checkin_today")
    private final int f101627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("user_day_count")
    private final int f101628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("user_view_time")
    private final int f101629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("portrait")
    @NotNull
    private final String f101630f;

    public UnitedSeasonUserActivity(@NotNull String str, int i7, int i8, int i9, int i10, long j7) {
        this.f101625a = i7;
        this.f101626b = j7;
        this.f101627c = i8;
        this.f101628d = i9;
        this.f101629e = i10;
        this.f101630f = str;
    }

    public final int a() {
        return this.f101627c;
    }

    public final long b() {
        return this.f101626b;
    }

    @NotNull
    public final String c() {
        return this.f101630f;
    }

    public final int d() {
        return this.f101628d;
    }

    public final int e() {
        return this.f101625a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnitedSeasonUserActivity)) {
            return false;
        }
        UnitedSeasonUserActivity unitedSeasonUserActivity = (UnitedSeasonUserActivity) obj;
        return this.f101625a == unitedSeasonUserActivity.f101625a && this.f101626b == unitedSeasonUserActivity.f101626b && this.f101627c == unitedSeasonUserActivity.f101627c && this.f101628d == unitedSeasonUserActivity.f101628d && this.f101629e == unitedSeasonUserActivity.f101629e && Intrinsics.areEqual(this.f101630f, unitedSeasonUserActivity.f101630f);
    }

    public final int f() {
        return this.f101629e;
    }

    public final int hashCode() {
        return this.f101630f.hashCode() + androidx.compose.animation.core.I.a(this.f101629e, androidx.compose.animation.core.I.a(this.f101628d, androidx.compose.animation.core.I.a(this.f101627c, C3554n0.a(Integer.hashCode(this.f101625a) * 31, 31, this.f101626b), 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        int i7 = this.f101625a;
        long j7 = this.f101626b;
        int i8 = this.f101627c;
        int i9 = this.f101628d;
        int i10 = this.f101629e;
        String str = this.f101630f;
        StringBuilder sbA = C2157f0.a(i7, j7, "UnitedSeasonUserActivity(userState=", ", lastCheckInDate=");
        W60.F.b(i8, i9, ", checkInToday=", ", userDayCount=", sbA);
        cf.l.a(i10, ", userViewTime=", ", portrait=", str, sbA);
        sbA.append(")");
        return sbA.toString();
    }
}
