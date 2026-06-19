package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.ship.theseus.ogv.season.NewestEp;
import com.bilibili.ship.theseus.ogv.season.OgvSeasonRights;
import com.bilibili.ship.theseus.ogv.season.OgvSeasonStat;
import com.bilibili.ship.theseus.ogv.season.Publish;
import com.bilibili.ship.theseus.ogv.season.TestSwitch;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/SectionFloatLayerSeason.class */
@StabilityInferred(parameters = 0)
@Bson
public final class SectionFloatLayerSeason implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<OgvOldSeasonModule> f93639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final OgvSeasonRights f93640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Publish f93641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("new_ep")
    @Nullable
    private final NewestEp f93642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final TestSwitch f93643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final OgvSeasonStat f93644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f93645g;

    @NotNull
    public final com.bilibili.ogv.pub.season.a h;

    public SectionFloatLayerSeason(@NotNull List<OgvOldSeasonModule> list, @NotNull OgvSeasonRights ogvSeasonRights, @NotNull Publish publish, @Nullable NewestEp newestEp, @NotNull TestSwitch testSwitch, @NotNull OgvSeasonStat ogvSeasonStat, long j7, @NotNull com.bilibili.ogv.pub.season.a aVar) {
        this.f93639a = list;
        this.f93640b = ogvSeasonRights;
        this.f93641c = publish;
        this.f93642d = newestEp;
        this.f93643e = testSwitch;
        this.f93644f = ogvSeasonStat;
        this.f93645g = j7;
        this.h = aVar;
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.section.floatlayer.v
    @Nullable
    public final NewestEp a() {
        return this.f93642d;
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.section.floatlayer.v
    @NotNull
    public final TestSwitch b() {
        return this.f93643e;
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.section.floatlayer.v
    @NotNull
    public final com.bilibili.ogv.pub.season.a c() {
        return this.h;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionFloatLayerSeason)) {
            return false;
        }
        SectionFloatLayerSeason sectionFloatLayerSeason = (SectionFloatLayerSeason) obj;
        return Intrinsics.areEqual(this.f93639a, sectionFloatLayerSeason.f93639a) && Intrinsics.areEqual(this.f93640b, sectionFloatLayerSeason.f93640b) && Intrinsics.areEqual(this.f93641c, sectionFloatLayerSeason.f93641c) && Intrinsics.areEqual(this.f93642d, sectionFloatLayerSeason.f93642d) && Intrinsics.areEqual(this.f93643e, sectionFloatLayerSeason.f93643e) && Intrinsics.areEqual(this.f93644f, sectionFloatLayerSeason.f93644f) && this.f93645g == sectionFloatLayerSeason.f93645g && Intrinsics.areEqual(this.h, sectionFloatLayerSeason.h);
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.section.floatlayer.v
    @NotNull
    public final Publish getPublish() {
        return this.f93641c;
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.section.floatlayer.v
    @NotNull
    public final OgvSeasonRights getRights() {
        return this.f93640b;
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.section.floatlayer.v
    public final long getSeasonId() {
        return this.f93645g;
    }

    public final int hashCode() {
        int iHashCode = this.f93639a.hashCode();
        int iHashCode2 = this.f93640b.hashCode();
        int iHashCode3 = this.f93641c.hashCode();
        NewestEp newestEp = this.f93642d;
        return Integer.hashCode(this.h.f71782a) + C3554n0.a((this.f93644f.hashCode() + ((this.f93643e.hashCode() + ((((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31) + (newestEp == null ? 0 : newestEp.hashCode())) * 31)) * 31)) * 31, 31, this.f93645g);
    }

    @NotNull
    public final String toString() {
        return "SectionFloatLayerSeason(modules=" + this.f93639a + ", rights=" + this.f93640b + ", publish=" + this.f93641c + ", newestEp=" + this.f93642d + ", testSwitch=" + this.f93643e + ", stat=" + this.f93644f + ", seasonId=" + this.f93645g + ", displayedSeasonType=" + this.h + ")";
    }
}
