package com.bilibili.upper.module.manuscript.model;

import I.E;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/model/a.class */
@StabilityInferred(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f113663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f113664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f113665c;

    public a(long j7, @NotNull String str, int i7) {
        this.f113663a = j7;
        this.f113664b = str;
        this.f113665c = i7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f113663a == aVar.f113663a && Intrinsics.areEqual(this.f113664b, aVar.f113664b) && this.f113665c == aVar.f113665c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f113665c) + E.a(Long.hashCode(this.f113663a) * 31, 31, this.f113664b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AppealState(aid=");
        sb.append(this.f113663a);
        sb.append(", url=");
        sb.append(this.f113664b);
        sb.append(", state=");
        return C4277b.a(this.f113665c, ")", sb);
    }
}
