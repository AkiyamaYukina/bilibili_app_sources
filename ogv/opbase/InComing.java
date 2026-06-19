package com.bilibili.ogv.opbase;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/InComing.class */
@StabilityInferred(parameters = 1)
@Bson
public final class InComing {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f69845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f69846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f69847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f69848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f69849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f69850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f69851g;

    @NotNull
    public final String h;

    public InComing(long j7, int i7, int i8, long j8, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.f69845a = str;
        this.f69846b = str2;
        this.f69847c = i7;
        this.f69848d = i8;
        this.f69849e = j7;
        this.f69850f = str3;
        this.f69851g = j8;
        this.h = str4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InComing)) {
            return false;
        }
        InComing inComing = (InComing) obj;
        return Intrinsics.areEqual(this.f69845a, inComing.f69845a) && Intrinsics.areEqual(this.f69846b, inComing.f69846b) && this.f69847c == inComing.f69847c && this.f69848d == inComing.f69848d && this.f69849e == inComing.f69849e && Intrinsics.areEqual(this.f69850f, inComing.f69850f) && this.f69851g == inComing.f69851g && Intrinsics.areEqual(this.h, inComing.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + C3554n0.a(E.a(C3554n0.a(I.a(this.f69848d, I.a(this.f69847c, E.a(this.f69845a.hashCode() * 31, 31, this.f69846b), 31), 31), 31, this.f69849e), 31, this.f69850f), 31, this.f69851g);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("InComing(dynamic=");
        sb.append(this.f69845a);
        sb.append(", image=");
        sb.append(this.f69846b);
        sb.append(", showTimes=");
        sb.append(this.f69847c);
        sb.append(", type=");
        sb.append(this.f69848d);
        sb.append(", tabId=");
        sb.append(this.f69849e);
        sb.append(", moduleId=");
        sb.append(this.f69850f);
        sb.append(", itemId=");
        sb.append(this.f69851g);
        sb.append(", url=");
        return C8770a.a(sb, this.h, ")");
    }
}
