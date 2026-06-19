package com.bilibili.ship.theseus.ogv.intro.section.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/bean/EpisodeStat.class */
@StabilityInferred(parameters = 1)
@Bson
public final class EpisodeStat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final StatNumber f93536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("vt")
    @NotNull
    private final StatNumber f93537b;

    public EpisodeStat(@NotNull StatNumber statNumber, @NotNull StatNumber statNumber2) {
        this.f93536a = statNumber;
        this.f93537b = statNumber2;
    }

    @NotNull
    public final StatNumber a() {
        return this.f93537b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpisodeStat)) {
            return false;
        }
        EpisodeStat episodeStat = (EpisodeStat) obj;
        return Intrinsics.areEqual(this.f93536a, episodeStat.f93536a) && Intrinsics.areEqual(this.f93537b, episodeStat.f93537b);
    }

    public final int hashCode() {
        return this.f93537b.hashCode() + (this.f93536a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "EpisodeStat(danmaku=" + this.f93536a + ", playedCount=" + this.f93537b + ")";
    }
}
