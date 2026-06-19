package com.bilibili.ogv.pub.community;

import I.E;
import androidx.appcompat.app.i;
import androidx.compose.foundation.C3554n0;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/community/Celebrity.class */
@Bson
public final class Celebrity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f71496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f71497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f71498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f71499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f71500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f71501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f71502g;

    @NotNull
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f71503i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f71504j;

    public Celebrity(long j7, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, long j8, boolean z6) {
        this.f71496a = j7;
        this.f71497b = str;
        this.f71498c = str2;
        this.f71499d = str3;
        this.f71500e = str4;
        this.f71501f = str5;
        this.f71502g = str6;
        this.h = str7;
        this.f71503i = j8;
        this.f71504j = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Celebrity)) {
            return false;
        }
        Celebrity celebrity = (Celebrity) obj;
        return this.f71496a == celebrity.f71496a && Intrinsics.areEqual(this.f71497b, celebrity.f71497b) && Intrinsics.areEqual(this.f71498c, celebrity.f71498c) && Intrinsics.areEqual(this.f71499d, celebrity.f71499d) && Intrinsics.areEqual(this.f71500e, celebrity.f71500e) && Intrinsics.areEqual(this.f71501f, celebrity.f71501f) && Intrinsics.areEqual(this.f71502g, celebrity.f71502g) && Intrinsics.areEqual(this.h, celebrity.h) && this.f71503i == celebrity.f71503i && this.f71504j == celebrity.f71504j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71504j) + C3554n0.a(E.a(E.a(E.a(E.a(E.a(E.a(E.a(Long.hashCode(this.f71496a) * 31, 31, this.f71497b), 31, this.f71498c), 31, this.f71499d), 31, this.f71500e), 31, this.f71501f), 31, this.f71502g), 31, this.h), 31, this.f71503i);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Celebrity(id=");
        sb.append(this.f71496a);
        sb.append(", name=");
        sb.append(this.f71497b);
        sb.append(", role=");
        sb.append(this.f71498c);
        sb.append(", avatar=");
        sb.append(this.f71499d);
        sb.append(", shortDesc=");
        sb.append(this.f71500e);
        sb.append(", desc=");
        sb.append(this.f71501f);
        sb.append(", characterAvatar=");
        sb.append(this.f71502g);
        sb.append(", link=");
        sb.append(this.h);
        sb.append(", mid=");
        sb.append(this.f71503i);
        sb.append(", isFollow=");
        return i.a(sb, this.f71504j, ")");
    }
}
