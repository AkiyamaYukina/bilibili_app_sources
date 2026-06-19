package com.bilibili.ship.theseus.cheese.biz.intro.publisher;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/D.class */
@StabilityInferred(parameters = 0)
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f89830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f89831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f89832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f89833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f89834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f89835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f89836g;

    public D(long j7, @NotNull String str, @NotNull String str2, boolean z6, @NotNull String str3, @NotNull String str4, boolean z7) {
        this.f89830a = j7;
        this.f89831b = str;
        this.f89832c = str2;
        this.f89833d = z6;
        this.f89834e = str3;
        this.f89835f = str4;
        this.f89836g = z7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d7 = (D) obj;
        return this.f89830a == d7.f89830a && Intrinsics.areEqual(this.f89831b, d7.f89831b) && Intrinsics.areEqual(this.f89832c, d7.f89832c) && this.f89833d == d7.f89833d && Intrinsics.areEqual(this.f89834e, d7.f89834e) && Intrinsics.areEqual(this.f89835f, d7.f89835f) && this.f89836g == d7.f89836g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f89836g) + I.E.a(I.E.a(androidx.compose.animation.z.a(I.E.a(I.E.a(Long.hashCode(this.f89830a) * 31, 31, this.f89831b), 31, this.f89832c), 31, this.f89833d), 31, this.f89834e), 31, this.f89835f);
    }

    @NotNull
    public final String toString() {
        boolean z6 = this.f89836g;
        StringBuilder sb = new StringBuilder("PugvSeasonCooperator(mid=");
        sb.append(this.f89830a);
        sb.append(", avatar=");
        sb.append(this.f89831b);
        sb.append(", username=");
        sb.append(this.f89832c);
        sb.append(", isOwner=");
        sb.append(this.f89833d);
        sb.append(", role=");
        sb.append(this.f89834e);
        sb.append(", userLink=");
        return androidx.fragment.app.B.c(this.f89835f, ", followed=", ")", sb, z6);
    }
}
