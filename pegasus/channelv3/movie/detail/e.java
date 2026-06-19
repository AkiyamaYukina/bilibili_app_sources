package com.bilibili.pegasus.channelv3.movie.detail;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/detail/e.class */
@StabilityInferred(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f75370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f75371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f75372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f75373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f75374e;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(e.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f75370a, eVar.f75370a) && Intrinsics.areEqual(this.f75371b, eVar.f75371b) && Intrinsics.areEqual(this.f75372c, eVar.f75372c) && this.f75373d == eVar.f75373d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f75373d) + E.a(E.a(this.f75370a.hashCode() * 31, 31, this.f75371b), 31, this.f75372c);
    }
}
