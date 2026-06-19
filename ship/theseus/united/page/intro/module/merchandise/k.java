package com.bilibili.ship.theseus.united.page.intro.module.merchandise;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/merchandise/k.class */
@StabilityInferred(parameters = 1)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f100592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f100593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f100594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f100595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f100596e;

    public k(@Nullable String str, @Nullable String str2, @Nullable String str3, int i7, int i8) {
        this.f100592a = str;
        this.f100593b = str2;
        this.f100594c = str3;
        this.f100595d = i7;
        this.f100596e = i8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.areEqual(this.f100592a, kVar.f100592a) && Intrinsics.areEqual(this.f100593b, kVar.f100593b) && Intrinsics.areEqual(this.f100594c, kVar.f100594c) && this.f100595d == kVar.f100595d && this.f100596e == kVar.f100596e;
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f100592a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f100593b;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f100594c;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return Integer.hashCode(this.f100596e) + I.a(this.f100595d, ((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchandiseTitle(title=");
        sb.append(this.f100592a);
        sb.append(", dayColor=");
        sb.append(this.f100593b);
        sb.append(", nightColor=");
        sb.append(this.f100594c);
        sb.append(", fontSize=");
        sb.append(this.f100595d);
        sb.append(", textDecoration=");
        return C4277b.a(this.f100596e, ")", sb);
    }
}
