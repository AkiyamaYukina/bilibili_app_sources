package com.bilibili.ship.theseus.ogv.intro.download.bean;

import N1.o;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/bean/OgvEpisodeReserve.class */
@StabilityInferred(parameters = 0)
@Bson
public final class OgvEpisodeReserve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f92372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final List<OgvEpisode> f92373b;

    public OgvEpisodeReserve(@Nullable String str, @Nullable List<OgvEpisode> list) {
        this.f92372a = str;
        this.f92373b = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvEpisodeReserve)) {
            return false;
        }
        OgvEpisodeReserve ogvEpisodeReserve = (OgvEpisodeReserve) obj;
        return Intrinsics.areEqual(this.f92372a, ogvEpisodeReserve.f92372a) && Intrinsics.areEqual(this.f92373b, ogvEpisodeReserve.f92373b);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f92372a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        List<OgvEpisode> list = this.f92373b;
        if (list != null) {
            iHashCode = list.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        List<OgvEpisode> list = this.f92373b;
        return o.a(this.f92372a, ", episodes=", ")", new StringBuilder("OgvEpisodeReserve(tip="), list);
    }
}
