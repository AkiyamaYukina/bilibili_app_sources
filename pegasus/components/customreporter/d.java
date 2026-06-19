package com.bilibili.pegasus.components.customreporter;

import Fa.T;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/customreporter/d.class */
@StabilityInferred(parameters = 1)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f75935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Long f75936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f75937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f75938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Boolean f75939e;

    public /* synthetic */ d(long j7, int i7) {
        this(j7, null, i7, true, null);
    }

    public d(long j7, @Nullable Long l7, int i7, boolean z6, @Nullable Boolean bool) {
        this.f75935a = j7;
        this.f75936b = l7;
        this.f75937c = i7;
        this.f75938d = z6;
        this.f75939e = bool;
    }

    public static d a(d dVar, Long l7, Boolean bool) {
        return new d(dVar.f75935a, l7, dVar.f75937c, false, bool);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f75935a == dVar.f75935a && Intrinsics.areEqual(this.f75936b, dVar.f75936b) && this.f75937c == dVar.f75937c && this.f75938d == dVar.f75938d && Intrinsics.areEqual(this.f75939e, dVar.f75939e);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f75935a);
        Long l7 = this.f75936b;
        int iA = z.a(I.a(this.f75937c, ((iHashCode * 31) + (l7 == null ? 0 : l7.hashCode())) * 31, 31), 31, this.f75938d);
        Boolean bool = this.f75939e;
        return iA + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadingInfo(start=");
        sb.append(this.f75935a);
        sb.append(", end=");
        sb.append(this.f75936b);
        sb.append(", flush=");
        sb.append(this.f75937c);
        sb.append(", request=");
        sb.append(this.f75938d);
        sb.append(", success=");
        return T.a(sb, this.f75939e, ")");
    }
}
