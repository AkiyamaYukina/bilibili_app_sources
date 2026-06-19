package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/e.class */
@StabilityInferred(parameters = 1)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f97321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f97322b;

    public e(@NotNull String str, @NotNull String str2) {
        this.f97321a = str;
        this.f97322b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f97321a, eVar.f97321a) && Intrinsics.areEqual(this.f97322b, eVar.f97322b);
    }

    public final int hashCode() {
        return this.f97322b.hashCode() + (this.f97321a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Neutral(icon=");
        sb.append(this.f97321a);
        sb.append(", title=");
        return C8770a.a(sb, this.f97322b, ")");
    }
}
