package com.bilibili.ship.theseus.ogv.intro.download.service;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.intro.download.ui.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/service/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f92400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f92401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final e0 f92402c;

    public b(@NotNull String str, long j7, @NotNull e0 e0Var) {
        this.f92400a = str;
        this.f92401b = j7;
        this.f92402c = e0Var;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f92400a, bVar.f92400a) && this.f92401b == bVar.f92401b && Intrinsics.areEqual(this.f92402c, bVar.f92402c);
    }

    public final int hashCode() {
        return this.f92402c.hashCode() + C3554n0.a(this.f92400a.hashCode() * 31, 31, this.f92401b);
    }

    @NotNull
    public final String toString() {
        return "DownloadStateModel(seasonId=" + this.f92400a + ", episodeId=" + this.f92401b + ", state=" + this.f92402c + ")";
    }
}
