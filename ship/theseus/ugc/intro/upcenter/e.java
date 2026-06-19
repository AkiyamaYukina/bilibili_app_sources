package com.bilibili.ship.theseus.ugc.intro.upcenter;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/e.class */
@StabilityInferred(parameters = 1)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f97557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ExtType f97558b;

    public e() {
        this("", ExtType.UNRECOGNIZED);
    }

    public e(@NotNull String str, @NotNull ExtType extType) {
        this.f97557a = str;
        this.f97558b = extType;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f97557a, eVar.f97557a) && this.f97558b == eVar.f97558b;
    }

    public final int hashCode() {
        return this.f97558b.hashCode() + (this.f97557a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "UgcUpCenterTab(data=" + this.f97557a + ", extType=" + this.f97558b + ")";
    }
}
