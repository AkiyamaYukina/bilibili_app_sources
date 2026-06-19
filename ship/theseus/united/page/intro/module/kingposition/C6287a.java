package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/a.class */
@StabilityInferred(parameters = 1)
public final class C6287a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f100451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f100452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f100453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f100454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f100455e;

    public C6287a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        this.f100451a = str;
        this.f100452b = str2;
        this.f100453c = str3;
        this.f100454d = str4;
        this.f100455e = str5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6287a)) {
            return false;
        }
        C6287a c6287a = (C6287a) obj;
        return Intrinsics.areEqual(this.f100451a, c6287a.f100451a) && Intrinsics.areEqual(this.f100452b, c6287a.f100452b) && Intrinsics.areEqual(this.f100453c, c6287a.f100453c) && Intrinsics.areEqual(this.f100454d, c6287a.f100454d) && Intrinsics.areEqual(this.f100455e, c6287a.f100455e);
    }

    public final int hashCode() {
        return this.f100455e.hashCode() + I.E.a(I.E.a(I.E.a(this.f100451a.hashCode() * 31, 31, this.f100452b), 31, this.f100453c), 31, this.f100454d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CoinExtend(zip=");
        sb.append(this.f100451a);
        sb.append(", icon1=");
        sb.append(this.f100452b);
        sb.append(", icon2=");
        sb.append(this.f100453c);
        sb.append(", icon3=");
        sb.append(this.f100454d);
        sb.append(", icon4=");
        return C8770a.a(sb, this.f100455e, ")");
    }
}
