package com.bilibili.ogv.opbase;

import androidx.compose.animation.z;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/FollowInCard.class */
@StabilityInferred(parameters = 0)
@Bson
public final class FollowInCard {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f69825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f69826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("new_ep")
    @Nullable
    private final NewestEp f69827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final FavorDesc f69828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f69829e;

    public FollowInCard(boolean z6, boolean z7, @Nullable NewestEp newestEp, @Nullable FavorDesc favorDesc, int i7) {
        this.f69825a = z6;
        this.f69826b = z7;
        this.f69827c = newestEp;
        this.f69828d = favorDesc;
        this.f69829e = i7;
    }

    @Nullable
    public final NewestEp a() {
        return this.f69827c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowInCard)) {
            return false;
        }
        FollowInCard followInCard = (FollowInCard) obj;
        return this.f69825a == followInCard.f69825a && this.f69826b == followInCard.f69826b && Intrinsics.areEqual(this.f69827c, followInCard.f69827c) && Intrinsics.areEqual(this.f69828d, followInCard.f69828d) && this.f69829e == followInCard.f69829e;
    }

    public final int hashCode() {
        int iA = z.a(Boolean.hashCode(this.f69825a) * 31, 31, this.f69826b);
        NewestEp newestEp = this.f69827c;
        int iHashCode = 0;
        int iHashCode2 = newestEp == null ? 0 : newestEp.hashCode();
        FavorDesc favorDesc = this.f69828d;
        if (favorDesc != null) {
            iHashCode = favorDesc.hashCode();
        }
        return Integer.hashCode(this.f69829e) + ((((iA + iHashCode2) * 31) + iHashCode) * 31);
    }

    @NotNull
    public final String toString() {
        NewestEp newestEp = this.f69827c;
        StringBuilder sb = new StringBuilder("FollowInCard(isFinished=");
        sb.append(this.f69825a);
        sb.append(", isStarted=");
        sb.append(this.f69826b);
        sb.append(", newestEp=");
        sb.append(newestEp);
        sb.append(", desc=");
        sb.append(this.f69828d);
        sb.append(", totalCount=");
        return C4277b.a(this.f69829e, ")", sb);
    }
}
