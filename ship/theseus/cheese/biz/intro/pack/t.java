package com.bilibili.ship.theseus.cheese.biz.intro.pack;

import I.E;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/t.class */
@Stable
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f89569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f89570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f89571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f89572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f89573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f89574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f89575g;

    @NotNull
    public final u h;

    public t(long j7, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull u uVar) {
        this.f89569a = j7;
        this.f89570b = str;
        this.f89571c = str2;
        this.f89572d = str3;
        this.f89573e = str4;
        this.f89574f = str5;
        this.f89575g = str6;
        this.h = uVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f89569a == tVar.f89569a && Intrinsics.areEqual(this.f89570b, tVar.f89570b) && Intrinsics.areEqual(this.f89571c, tVar.f89571c) && Intrinsics.areEqual(this.f89572d, tVar.f89572d) && Intrinsics.areEqual(this.f89573e, tVar.f89573e) && Intrinsics.areEqual(this.f89574f, tVar.f89574f) && Intrinsics.areEqual(this.f89575g, tVar.f89575g) && Intrinsics.areEqual(this.h, tVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + E.a(E.a(E.a(E.a(E.a(E.a(Long.hashCode(this.f89569a) * 31, 31, this.f89570b), 31, this.f89571c), 31, this.f89572d), 31, this.f89573e), 31, this.f89574f), 31, this.f89575g);
    }

    @NotNull
    public final String toString() {
        return "PugvPackageItem(productId=" + this.f89569a + ", cover=" + this.f89570b + ", title=" + this.f89571c + ", discountPriceDesc=" + this.f89572d + ", originalPriceDesc=" + this.f89573e + ", desc=" + this.f89574f + ", link=" + this.f89575g + ", saleInfo=" + this.h + ")";
    }
}
