package com.bilibili.ship.theseus.ugc.intro.uprecommend;

import Vn.A;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpDescRelation.class */
@StabilityInferred(parameters = 1)
@Bson
public final class RecommendUpDescRelation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final int f97790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("is_follow")
    private final int f97791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("is_followed")
    private final int f97792c;

    public RecommendUpDescRelation(int i7, int i8, int i9) {
        this.f97790a = i7;
        this.f97791b = i8;
        this.f97792c = i9;
    }

    public static RecommendUpDescRelation a(RecommendUpDescRelation recommendUpDescRelation, int i7) {
        return new RecommendUpDescRelation(recommendUpDescRelation.f97790a, i7, recommendUpDescRelation.f97792c);
    }

    public final int b() {
        return this.f97791b;
    }

    public final int c() {
        return this.f97792c;
    }

    public final int d() {
        return this.f97790a;
    }

    public final boolean e() {
        boolean z6 = true;
        if (this.f97791b != 1) {
            z6 = false;
        }
        return z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendUpDescRelation)) {
            return false;
        }
        RecommendUpDescRelation recommendUpDescRelation = (RecommendUpDescRelation) obj;
        return this.f97790a == recommendUpDescRelation.f97790a && this.f97791b == recommendUpDescRelation.f97791b && this.f97792c == recommendUpDescRelation.f97792c;
    }

    public final boolean f() {
        boolean z6 = true;
        if (this.f97792c != 1) {
            z6 = false;
        }
        return z6;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f97792c) + I.a(this.f97791b, Integer.hashCode(this.f97790a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return C4277b.a(this.f97792c, ")", A.b(this.f97790a, this.f97791b, "RecommendUpDescRelation(status=", ", follow=", ", followed="));
    }
}
