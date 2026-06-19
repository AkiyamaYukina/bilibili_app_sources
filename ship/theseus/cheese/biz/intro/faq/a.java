package com.bilibili.ship.theseus.cheese.biz.intro.faq;

import androidx.compose.runtime.internal.StabilityInferred;
import eu0.C7004w;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/faq/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C7004w f89419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<d> f89420b;

    public a(@NotNull C7004w c7004w, @NotNull List<d> list) {
        this.f89419a = c7004w;
        this.f89420b = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f89419a, aVar.f89419a) && Intrinsics.areEqual(this.f89420b, aVar.f89420b);
    }

    public final int hashCode() {
        return this.f89420b.hashCode() + (this.f89419a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "CheeseFaq(nav=" + this.f89419a + ", contents=" + this.f89420b + ")";
    }
}
