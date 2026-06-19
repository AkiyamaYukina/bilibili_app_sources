package com.bilibili.ship.theseus.cheese.biz.intro.publisher;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/F.class */
@StabilityInferred(parameters = 0)
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f89841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<G> f89842b;

    public F(@NotNull String str, @NotNull List<G> list) {
        this.f89841a = str;
        this.f89842b = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f7 = (F) obj;
        return Intrinsics.areEqual(this.f89841a, f7.f89841a) && Intrinsics.areEqual(this.f89842b, f7.f89842b);
    }

    public final int hashCode() {
        return this.f89842b.hashCode() + (this.f89841a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        List<G> list = this.f89842b;
        return N1.o.a(this.f89841a, ", items=", ")", new StringBuilder("PugvSeasonPublisherSkuContent(title="), list);
    }
}
