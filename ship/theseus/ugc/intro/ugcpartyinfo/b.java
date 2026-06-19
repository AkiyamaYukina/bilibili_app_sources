package com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo;

import I.E;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcpartyinfo/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f97418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f97419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f97420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f97421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f97422e;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f97418a == bVar.f97418a && Intrinsics.areEqual(this.f97419b, bVar.f97419b) && Intrinsics.areEqual(this.f97420c, bVar.f97420c) && this.f97421d == bVar.f97421d && this.f97422e == bVar.f97422e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f97422e) + C3554n0.a(E.a(E.a(Long.hashCode(this.f97418a) * 31, 31, this.f97419b), 31, this.f97420c), 31, this.f97421d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BizReserveActivityParam(activityId=");
        sb.append(this.f97418a);
        sb.append(", from=");
        sb.append(this.f97419b);
        sb.append(", type=");
        sb.append(this.f97420c);
        sb.append(", oid=");
        sb.append(this.f97421d);
        sb.append(", reserveId=");
        return android.support.v4.media.session.a.a(sb, this.f97422e, ")");
    }
}
