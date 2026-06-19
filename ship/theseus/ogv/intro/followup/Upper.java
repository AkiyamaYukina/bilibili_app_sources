package com.bilibili.ship.theseus.ogv.intro.followup;

import I.E;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/followup/Upper.class */
@StabilityInferred(parameters = 0)
@Bson
public final class Upper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f93060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f93061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f93062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f93063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("official")
    @NotNull
    private final OfficialVerify f93064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final VipInfo f93065f;

    public Upper(long j7, boolean z6, @NotNull String str, @NotNull String str2, @NotNull OfficialVerify officialVerify, @NotNull VipInfo vipInfo) {
        this.f93060a = j7;
        this.f93061b = z6;
        this.f93062c = str;
        this.f93063d = str2;
        this.f93064e = officialVerify;
        this.f93065f = vipInfo;
    }

    @NotNull
    public final OfficialVerify a() {
        return this.f93064e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Upper)) {
            return false;
        }
        Upper upper = (Upper) obj;
        return this.f93060a == upper.f93060a && this.f93061b == upper.f93061b && Intrinsics.areEqual(this.f93062c, upper.f93062c) && Intrinsics.areEqual(this.f93063d, upper.f93063d) && Intrinsics.areEqual(this.f93064e, upper.f93064e) && Intrinsics.areEqual(this.f93065f, upper.f93065f);
    }

    public final int hashCode() {
        int iA = E.a(E.a(z.a(Long.hashCode(this.f93060a) * 31, 31, this.f93061b), 31, this.f93062c), 31, this.f93063d);
        return Boolean.hashCode(this.f93065f.f93067a) + ((this.f93064e.hashCode() + iA) * 31);
    }

    @NotNull
    public final String toString() {
        return "Upper(mid=" + this.f93060a + ", attention=" + this.f93061b + ", name=" + this.f93062c + ", face=" + this.f93063d + ", officialVerify=" + this.f93064e + ", vip=" + this.f93065f + ")";
    }
}
