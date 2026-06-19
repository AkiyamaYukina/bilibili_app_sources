package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/E0.class */
@StabilityInferred(parameters = 1)
public final class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f100985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f100986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f100987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f100988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f100989e;

    public E0(long j7, long j8, long j9, int i7, @NotNull String str) {
        this.f100985a = j7;
        this.f100986b = j8;
        this.f100987c = i7;
        this.f100988d = j9;
        this.f100989e = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e02 = (E0) obj;
        return this.f100985a == e02.f100985a && this.f100986b == e02.f100986b && this.f100987c == e02.f100987c && this.f100988d == e02.f100988d && Intrinsics.areEqual(this.f100989e, e02.f100989e);
    }

    public final int hashCode() {
        return this.f100989e.hashCode() + C3554n0.a(androidx.compose.animation.core.I.a(this.f100987c, C3554n0.a(Long.hashCode(this.f100985a) * 31, 31, this.f100986b), 31), 31, this.f100988d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RelateReasons(id=");
        sb.append(this.f100985a);
        sb.append(", mid=");
        sb.append(this.f100986b);
        sb.append(", rid=");
        sb.append(this.f100987c);
        sb.append(", tagId=");
        sb.append(this.f100988d);
        sb.append(", name=");
        return C8770a.a(sb, this.f100989e, ")");
    }
}
