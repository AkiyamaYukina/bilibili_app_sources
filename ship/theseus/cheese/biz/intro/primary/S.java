package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/S.class */
@StabilityInferred(parameters = 1)
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f89681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f89682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f89683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PugvBadgeType f89684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f89685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f89686f;

    public S(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull PugvBadgeType pugvBadgeType, int i7, int i8) {
        this.f89681a = str;
        this.f89682b = str2;
        this.f89683c = str3;
        this.f89684d = pugvBadgeType;
        this.f89685e = i7;
        this.f89686f = i8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s7 = (S) obj;
        return Intrinsics.areEqual(this.f89681a, s7.f89681a) && Intrinsics.areEqual(this.f89682b, s7.f89682b) && Intrinsics.areEqual(this.f89683c, s7.f89683c) && this.f89684d == s7.f89684d && this.f89685e == s7.f89685e && this.f89686f == s7.f89686f;
    }

    public final int hashCode() {
        int iA = I.E.a(I.E.a(this.f89681a.hashCode() * 31, 31, this.f89682b), 31, this.f89683c);
        return Integer.hashCode(this.f89686f) + androidx.compose.animation.core.I.a(this.f89685e, (this.f89684d.hashCode() + iA) * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PugvSeasonPrimaryBadge(icon=");
        sb.append(this.f89681a);
        sb.append(", link=");
        sb.append(this.f89682b);
        sb.append(", nightIcon=");
        sb.append(this.f89683c);
        sb.append(", type=");
        sb.append(this.f89684d);
        sb.append(", width=");
        sb.append(this.f89685e);
        sb.append(", height=");
        return C4277b.a(this.f89686f, ")", sb);
    }
}
