package com.bilibili.ship.theseus.cheese.biz.intro.publisher;

import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/B.class */
@StabilityInferred(parameters = 0)
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f89795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f89796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f89797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f89798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f89799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f89800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f89801g;

    @NotNull
    public final A h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f89802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f89803j;

    public B(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i7, long j7, @NotNull String str5, @NotNull A a7, @NotNull String str6, long j8) {
        this.f89795a = str;
        this.f89796b = str2;
        this.f89797c = str3;
        this.f89798d = str4;
        this.f89799e = i7;
        this.f89800f = j7;
        this.f89801g = str5;
        this.h = a7;
        this.f89802i = str6;
        this.f89803j = j8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b7 = (B) obj;
        return Intrinsics.areEqual(this.f89795a, b7.f89795a) && Intrinsics.areEqual(this.f89796b, b7.f89796b) && Intrinsics.areEqual(this.f89797c, b7.f89797c) && Intrinsics.areEqual(this.f89798d, b7.f89798d) && this.f89799e == b7.f89799e && this.f89800f == b7.f89800f && Intrinsics.areEqual(this.f89801g, b7.f89801g) && Intrinsics.areEqual(this.h, b7.h) && Intrinsics.areEqual(this.f89802i, b7.f89802i) && this.f89803j == b7.f89803j;
    }

    public final int hashCode() {
        return Long.hashCode(this.f89803j) + I.E.a((this.h.hashCode() + I.E.a(C3554n0.a(I.a(this.f89799e, I.E.a(I.E.a(I.E.a(this.f89795a.hashCode() * 31, 31, this.f89796b), 31, this.f89797c), 31, this.f89798d), 31), 31, this.f89800f), 31, this.f89801g)) * 31, 31, this.f89802i);
    }

    @NotNull
    public final String toString() {
        int i7 = this.f89799e;
        StringBuilder sb = new StringBuilder("Owner(url=");
        sb.append(this.f89795a);
        sb.append(", titleUrl=");
        sb.append(this.f89796b);
        sb.append(", nickname=");
        sb.append(this.f89797c);
        sb.append(", fans=");
        H0.e.b(i7, this.f89798d, ", attention=", ", fansNum=", sb);
        sb.append(this.f89800f);
        sb.append(", seasonCount=");
        sb.append(this.f89801g);
        sb.append(", live=");
        sb.append(this.h);
        sb.append(", face=");
        sb.append(this.f89802i);
        sb.append(", mid=");
        return android.support.v4.media.session.a.a(sb, this.f89803j, ")");
    }
}
