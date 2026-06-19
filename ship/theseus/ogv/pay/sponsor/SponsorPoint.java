package com.bilibili.ship.theseus.ogv.pay.sponsor;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/sponsor/SponsorPoint.class */
@StabilityInferred(parameters = 1)
@Bson
public final class SponsorPoint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f94226a;

    public SponsorPoint(@NotNull String str) {
        this.f94226a = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SponsorPoint) && Intrinsics.areEqual(this.f94226a, ((SponsorPoint) obj).f94226a);
    }

    public final int hashCode() {
        return this.f94226a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C8770a.a(new StringBuilder("SponsorPoint(point="), this.f94226a, ")");
    }
}
