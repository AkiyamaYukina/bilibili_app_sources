package com.bilibili.ship.theseus.cheese.biz.intro.pack;

import androidx.compose.runtime.Stable;
import eu0.C7004w;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/s.class */
@Stable
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C7004w f89567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<t> f89568b;

    public s(@NotNull C7004w c7004w, @NotNull List<t> list) {
        this.f89567a = c7004w;
        this.f89568b = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.areEqual(this.f89567a, sVar.f89567a) && Intrinsics.areEqual(this.f89568b, sVar.f89568b);
    }

    public final int hashCode() {
        return this.f89568b.hashCode() + (this.f89567a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "PugvPackage(nav=" + this.f89567a + ", contents=" + this.f89568b + ")";
    }
}
