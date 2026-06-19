package com.bilibili.ship.theseus.cheese.biz.intro.pack;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/u.class */
@Stable
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f89576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f89577b;

    public u(@NotNull String str, @NotNull String str2) {
        this.f89576a = str;
        this.f89577b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.areEqual(this.f89576a, uVar.f89576a) && Intrinsics.areEqual(this.f89577b, uVar.f89577b);
    }

    public final int hashCode() {
        return this.f89577b.hashCode() + (this.f89576a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PugvPackageSaleInfo(icon=");
        sb.append(this.f89576a);
        sb.append(", iconDark=");
        return C8770a.a(sb, this.f89577b, ")");
    }
}
