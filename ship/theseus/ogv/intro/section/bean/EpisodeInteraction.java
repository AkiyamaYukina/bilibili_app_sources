package com.bilibili.ship.theseus.ogv.intro.section.bean;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/bean/EpisodeInteraction.class */
@StabilityInferred(parameters = 1)
@Bson
public final class EpisodeInteraction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InteractionHistoryNode f93514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("graph_version")
    private final long f93515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f93516c;

    public EpisodeInteraction(@NotNull InteractionHistoryNode interactionHistoryNode, long j7, @NotNull String str) {
        this.f93514a = interactionHistoryNode;
        this.f93515b = j7;
        this.f93516c = str;
    }

    public final long a() {
        return this.f93515b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpisodeInteraction)) {
            return false;
        }
        EpisodeInteraction episodeInteraction = (EpisodeInteraction) obj;
        return Intrinsics.areEqual(this.f93514a, episodeInteraction.f93514a) && this.f93515b == episodeInteraction.f93515b && Intrinsics.areEqual(this.f93516c, episodeInteraction.f93516c);
    }

    public final int hashCode() {
        return this.f93516c.hashCode() + C3554n0.a(this.f93514a.hashCode() * 31, 31, this.f93515b);
    }

    @NotNull
    public final String toString() {
        long j7 = this.f93515b;
        StringBuilder sb = new StringBuilder("EpisodeInteraction(historyNode=");
        sb.append(this.f93514a);
        sb.append(", version=");
        sb.append(j7);
        sb.append(", msg=");
        return C8770a.a(sb, this.f93516c, ")");
    }
}
