package com.bilibili.ship.theseus.ogv.pay.sponsor;

import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/sponsor/BangumiSponsorMineRank.class */
@StabilityInferred(parameters = 0)
@Bson
public final class BangumiSponsorMineRank {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f94205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94206b;

    public BangumiSponsorMineRank(@NotNull String str, int i7) {
        this.f94205a = str;
        this.f94206b = i7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BangumiSponsorMineRank)) {
            return false;
        }
        BangumiSponsorMineRank bangumiSponsorMineRank = (BangumiSponsorMineRank) obj;
        return Intrinsics.areEqual(this.f94205a, bangumiSponsorMineRank.f94205a) && this.f94206b == bangumiSponsorMineRank.f94206b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f94206b) + (this.f94205a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BangumiSponsorMineRank(count=");
        sb.append(this.f94205a);
        sb.append(", rank=");
        return C4277b.a(this.f94206b, ")", sb);
    }
}
