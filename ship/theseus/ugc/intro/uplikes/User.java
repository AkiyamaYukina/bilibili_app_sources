package com.bilibili.ship.theseus.ugc.intro.uplikes;

import I.E;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/User.class */
@StabilityInferred(parameters = 1)
@Bson
public final class User {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f97689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f97690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f97691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f97692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f97693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f97694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f97695g;

    @NotNull
    public final String h;

    public User() {
        this(0L, 0L, 0L, 0L, null, null, null, 0L, 255);
    }

    public /* synthetic */ User(long j7, long j8, long j9, long j10, String str, String str2, String str3, long j11, int i7) {
        this((i7 & 1) != 0 ? 0L : j7, (i7 & 2) != 0 ? "" : str, (i7 & 4) != 0 ? "" : str2, (i7 & 8) != 0 ? 0L : j8, (i7 & 16) != 0 ? 0L : j9, (i7 & 32) != 0 ? 0L : j10, (i7 & 64) != 0 ? 0L : j11, (i7 & 128) != 0 ? "" : str3);
    }

    public User(long j7, @NotNull String str, @NotNull String str2, long j8, long j9, long j10, long j11, @NotNull String str3) {
        this.f97689a = j7;
        this.f97690b = str;
        this.f97691c = str2;
        this.f97692d = j8;
        this.f97693e = j9;
        this.f97694f = j10;
        this.f97695g = j11;
        this.h = str3;
    }

    public final boolean a() {
        return this.f97689a == 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return this.f97689a == user.f97689a && Intrinsics.areEqual(this.f97690b, user.f97690b) && Intrinsics.areEqual(this.f97691c, user.f97691c) && this.f97692d == user.f97692d && this.f97693e == user.f97693e && this.f97694f == user.f97694f && this.f97695g == user.f97695g && Intrinsics.areEqual(this.h, user.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + C3554n0.a(C3554n0.a(C3554n0.a(C3554n0.a(E.a(E.a(Long.hashCode(this.f97689a) * 31, 31, this.f97690b), 31, this.f97691c), 31, this.f97692d), 31, this.f97693e), 31, this.f97694f), 31, this.f97695g);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("User(mid=");
        sb.append(this.f97689a);
        sb.append(", name=");
        sb.append(this.f97690b);
        sb.append(", face=");
        sb.append(this.f97691c);
        sb.append(", follower=");
        sb.append(this.f97692d);
        sb.append(", isAttention=");
        sb.append(this.f97693e);
        sb.append(", isInterrelation=");
        sb.append(this.f97694f);
        sb.append(", isFollow=");
        sb.append(this.f97695g);
        sb.append(", interactDesc=");
        return C8770a.a(sb, this.h, ")");
    }
}
