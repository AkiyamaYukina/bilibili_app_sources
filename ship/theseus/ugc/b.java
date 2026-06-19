package com.bilibili.ship.theseus.ugc;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/b.class */
@StabilityInferred(parameters = 1)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f96298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f96299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f96300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f96301d;

    public b(@NotNull String str, @NotNull String str2, @NotNull String str3, long j7) {
        this.f96298a = str;
        this.f96299b = str2;
        this.f96300c = str3;
        this.f96301d = j7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f96298a, bVar.f96298a) && Intrinsics.areEqual(this.f96299b, bVar.f96299b) && Intrinsics.areEqual(this.f96300c, bVar.f96300c) && this.f96301d == bVar.f96301d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f96301d) + E.a(E.a(this.f96298a.hashCode() * 31, 31, this.f96299b), 31, this.f96300c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ElecRankItem(avatar=");
        sb.append(this.f96298a);
        sb.append(", name=");
        sb.append(this.f96299b);
        sb.append(", message=");
        sb.append(this.f96300c);
        sb.append(", mid=");
        return android.support.v4.media.session.a.a(sb, this.f96301d, ")");
    }
}
