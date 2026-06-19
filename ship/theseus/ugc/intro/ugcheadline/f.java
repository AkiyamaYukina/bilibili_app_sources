package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/f.class */
@StabilityInferred(parameters = 1)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f97323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f97324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f97325c;

    public f(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.f97323a = str;
        this.f97324b = str2;
        this.f97325c = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f97323a, fVar.f97323a) && Intrinsics.areEqual(this.f97324b, fVar.f97324b) && Intrinsics.areEqual(this.f97325c, fVar.f97325c);
    }

    public final int hashCode() {
        return this.f97325c.hashCode() + E.a(this.f97323a.hashCode() * 31, 31, this.f97324b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Rank(icon=");
        sb.append(this.f97323a);
        sb.append(", iconNight=");
        sb.append(this.f97324b);
        sb.append(", text=");
        return C8770a.a(sb, this.f97325c, ")");
    }
}
