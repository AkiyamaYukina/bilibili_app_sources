package com.bilibili.ship.theseus.united.page.intro.module.liveorder;

import I.E;
import a5.C3188c;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/liveorder/f.class */
@StabilityInferred(parameters = 0)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f100516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f100517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f100518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f100519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final l f100520e;

    public f(long j7, @NotNull String str, @NotNull String str2, boolean z6, @Nullable l lVar) {
        this.f100516a = j7;
        this.f100517b = str;
        this.f100518c = str2;
        this.f100519d = z6;
        this.f100520e = lVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f100516a == fVar.f100516a && Intrinsics.areEqual(this.f100517b, fVar.f100517b) && Intrinsics.areEqual(this.f100518c, fVar.f100518c) && this.f100519d == fVar.f100519d && Intrinsics.areEqual(this.f100520e, fVar.f100520e);
    }

    public final int hashCode() {
        int iA = z.a(E.a(E.a(Long.hashCode(this.f100516a) * 31, 31, this.f100517b), 31, this.f100518c), 31, this.f100519d);
        l lVar = this.f100520e;
        return iA + (lVar == null ? 0 : lVar.hashCode());
    }

    @NotNull
    public final String toString() {
        boolean z6 = this.f100519d;
        StringBuilder sb = new StringBuilder("DetailReserveData(sid=");
        sb.append(this.f100516a);
        sb.append(", title=");
        sb.append(this.f100517b);
        sb.append(", business=");
        C3188c.a(this.f100518c, ", isFollow=", ", reserveCalendarInfo=", sb, z6);
        sb.append(this.f100520e);
        sb.append(")");
        return sb.toString();
    }
}
