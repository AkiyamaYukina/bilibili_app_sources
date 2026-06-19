package com.bilibili.ship.theseus.cheese.biz.intro.recommend;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/v.class */
@StabilityInferred(parameters = 1)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f90010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f90011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f90012c;

    public v(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.f90010a = str;
        this.f90011b = str2;
        this.f90012c = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.areEqual(this.f90010a, vVar.f90010a) && Intrinsics.areEqual(this.f90011b, vVar.f90011b) && Intrinsics.areEqual(this.f90012c, vVar.f90012c);
    }

    public final int hashCode() {
        return this.f90012c.hashCode() + E.a(this.f90010a.hashCode() * 31, 31, this.f90011b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PugvSeasonRecommendMore(title=");
        sb.append(this.f90010a);
        sb.append(", link=");
        sb.append(this.f90011b);
        sb.append(", linkText=");
        return C8770a.a(sb, this.f90012c, ")");
    }
}
