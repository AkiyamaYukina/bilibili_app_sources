package com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcpartyinfo/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f97417a;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f97417a == ((a) obj).f97417a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f97417a);
    }

    @NotNull
    public final String toString() {
        return android.support.v4.media.session.a.a(new StringBuilder("BizFavParam(seasonId="), this.f97417a, ")");
    }
}
