package com.bilibili.ship.theseus.ogv.intro;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.ship.theseus.ogv.intro.section.bean.StatNumber;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/OgvSeasonInfo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class OgvSeasonInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f92247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f92248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("play_data")
    @NotNull
    private final StatNumber f92249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Integer f92250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Integer f92251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Integer f92252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Integer f92253g;

    public OgvSeasonInfo(@NotNull String str, @NotNull String str2, @NotNull StatNumber statNumber, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        this.f92247a = str;
        this.f92248b = str2;
        this.f92249c = statNumber;
        this.f92250d = num;
        this.f92251e = num2;
        this.f92252f = num3;
        this.f92253g = num4;
    }

    @NotNull
    public final StatNumber a() {
        return this.f92249c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvSeasonInfo)) {
            return false;
        }
        OgvSeasonInfo ogvSeasonInfo = (OgvSeasonInfo) obj;
        return Intrinsics.areEqual(this.f92247a, ogvSeasonInfo.f92247a) && Intrinsics.areEqual(this.f92248b, ogvSeasonInfo.f92248b) && Intrinsics.areEqual(this.f92249c, ogvSeasonInfo.f92249c) && Intrinsics.areEqual(this.f92250d, ogvSeasonInfo.f92250d) && Intrinsics.areEqual(this.f92251e, ogvSeasonInfo.f92251e) && Intrinsics.areEqual(this.f92252f, ogvSeasonInfo.f92252f) && Intrinsics.areEqual(this.f92253g, ogvSeasonInfo.f92253g);
    }

    public final int hashCode() {
        int iA = I.E.a(this.f92247a.hashCode() * 31, 31, this.f92248b);
        int iHashCode = this.f92249c.hashCode();
        int iHashCode2 = 0;
        Integer num = this.f92250d;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.f92251e;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.f92252f;
        int iHashCode5 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.f92253g;
        if (num4 != null) {
            iHashCode2 = num4.hashCode();
        }
        return ((((((((iHashCode + iA) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode2;
    }

    @NotNull
    public final String toString() {
        StatNumber statNumber = this.f92249c;
        StringBuilder sb = new StringBuilder("OgvSeasonInfo(followers=");
        sb.append(this.f92247a);
        sb.append(", score=");
        sb.append(this.f92248b);
        sb.append(", seasonPlayedNumber=");
        sb.append(statNumber);
        sb.append(", scoreColor=");
        sb.append(this.f92250d);
        sb.append(", scoreNightColor=");
        sb.append(this.f92251e);
        sb.append(", textColor=");
        sb.append(this.f92252f);
        sb.append(", textNightColor=");
        return e4.c.a(sb, this.f92253g, ")");
    }
}
