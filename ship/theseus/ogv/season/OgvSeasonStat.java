package com.bilibili.ship.theseus.ogv.season;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.ship.theseus.ogv.intro.section.bean.StatNumber;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/season/OgvSeasonStat.class */
@StabilityInferred(parameters = 1)
@Bson
public final class OgvSeasonStat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f94495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("play_data")
    @NotNull
    private final StatNumber f94496b;

    public OgvSeasonStat(@NotNull String str, @NotNull StatNumber statNumber) {
        this.f94495a = str;
        this.f94496b = statNumber;
    }

    @NotNull
    public final StatNumber a() {
        return this.f94496b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvSeasonStat)) {
            return false;
        }
        OgvSeasonStat ogvSeasonStat = (OgvSeasonStat) obj;
        return Intrinsics.areEqual(this.f94495a, ogvSeasonStat.f94495a) && Intrinsics.areEqual(this.f94496b, ogvSeasonStat.f94496b);
    }

    public final int hashCode() {
        return this.f94496b.hashCode() + (this.f94495a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "OgvSeasonStat(followers=" + this.f94495a + ", playedCount=" + this.f94496b + ")";
    }
}
