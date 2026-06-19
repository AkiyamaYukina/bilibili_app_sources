package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/g.class */
@StabilityInferred(parameters = 0)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f97326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f97327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f97328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f97329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f97330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f97331f;

    public g(long j7, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.f97326a = j7;
        this.f97327b = str;
        this.f97328c = str2;
        this.f97329d = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f97326a == gVar.f97326a && Intrinsics.areEqual(this.f97327b, gVar.f97327b) && Intrinsics.areEqual(this.f97328c, gVar.f97328c) && Intrinsics.areEqual(this.f97329d, gVar.f97329d);
    }

    public final int hashCode() {
        return this.f97329d.hashCode() + E.a(E.a(Long.hashCode(this.f97326a) * 31, 31, this.f97327b), 31, this.f97328c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Tag(id=");
        sb.append(this.f97326a);
        sb.append(", name=");
        sb.append(this.f97327b);
        sb.append(", uri=");
        sb.append(this.f97328c);
        sb.append(", type=");
        return C8770a.a(sb, this.f97329d, ")");
    }
}
