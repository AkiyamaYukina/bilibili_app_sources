package com.bilibili.ship.theseus.united.page.intro.module.liveorder;

import I.E;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/liveorder/l.class */
@StabilityInferred(parameters = 0)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f100539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f100540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f100541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f100542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f100543e;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.areEqual(this.f100539a, lVar.f100539a) && this.f100540b == lVar.f100540b && this.f100541c == lVar.f100541c && Intrinsics.areEqual(this.f100542d, lVar.f100542d) && Intrinsics.areEqual(this.f100543e, lVar.f100543e);
    }

    public final int hashCode() {
        return this.f100543e.hashCode() + E.a(C3554n0.a(C3554n0.a(this.f100539a.hashCode() * 31, 31, this.f100540b), 31, this.f100541c), 31, this.f100542d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReserveCalendarInfo(title=");
        sb.append(this.f100539a);
        sb.append(", startTime=");
        sb.append(this.f100540b);
        sb.append(", endTime=");
        sb.append(this.f100541c);
        sb.append(", description=");
        sb.append(this.f100542d);
        sb.append(", businessId=");
        return C8770a.a(sb, this.f100543e, ")");
    }
}
