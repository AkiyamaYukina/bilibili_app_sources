package com.bilibili.ship.theseus.ugc.intro.uprecommend;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpDescButton.class */
@StabilityInferred(parameters = 1)
@Bson
public final class RecommendUpDescButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("text")
    @NotNull
    private final String f97786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("type")
    private final int f97787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("relation")
    @Nullable
    private final RecommendUpDescRelation f97788c;

    public RecommendUpDescButton(@NotNull String str, int i7, @Nullable RecommendUpDescRelation recommendUpDescRelation) {
        this.f97786a = str;
        this.f97787b = i7;
        this.f97788c = recommendUpDescRelation;
    }

    public static RecommendUpDescButton a(RecommendUpDescButton recommendUpDescButton, RecommendUpDescRelation recommendUpDescRelation) {
        return new RecommendUpDescButton(recommendUpDescButton.f97786a, recommendUpDescButton.f97787b, recommendUpDescRelation);
    }

    @Nullable
    public final RecommendUpDescRelation b() {
        return this.f97788c;
    }

    @NotNull
    public final String c() {
        return this.f97786a;
    }

    public final int d() {
        return this.f97787b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendUpDescButton)) {
            return false;
        }
        RecommendUpDescButton recommendUpDescButton = (RecommendUpDescButton) obj;
        return Intrinsics.areEqual(this.f97786a, recommendUpDescButton.f97786a) && this.f97787b == recommendUpDescButton.f97787b && Intrinsics.areEqual(this.f97788c, recommendUpDescButton.f97788c);
    }

    public final int hashCode() {
        int iA = I.a(this.f97787b, this.f97786a.hashCode() * 31, 31);
        RecommendUpDescRelation recommendUpDescRelation = this.f97788c;
        return iA + (recommendUpDescRelation == null ? 0 : recommendUpDescRelation.hashCode());
    }

    @NotNull
    public final String toString() {
        String str = this.f97786a;
        int i7 = this.f97787b;
        RecommendUpDescRelation recommendUpDescRelation = this.f97788c;
        StringBuilder sbA = androidx.constraintlayout.widget.e.a(i7, "RecommendUpDescButton(text=", str, ", type=", ", relation=");
        sbA.append(recommendUpDescRelation);
        sbA.append(")");
        return sbA.toString();
    }
}
