package com.bilibili.ship.theseus.cheese.biz.additional;

import I.E;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.D;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/additional/CheeseActivityProgress.class */
@StabilityInferred(parameters = 1)
@Bson
public final class CheeseActivityProgress {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("complete_query_interval")
    private final long f88985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("complete_activity_msg")
    @NotNull
    private final String f88986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("view_progress_msg")
    @NotNull
    private final String f88987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("complete_notified")
    private final boolean f88988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("start_activity_msg")
    @NotNull
    private final String f88989e;

    public CheeseActivityProgress() {
        this(null, 31, 0L, null, false, null);
    }

    public CheeseActivityProgress(String str, int i7, long j7, String str2, boolean z6, String str3) {
        j7 = (i7 & 1) != 0 ? 0L : j7;
        str = (i7 & 2) != 0 ? "" : str;
        str2 = (i7 & 4) != 0 ? "" : str2;
        z6 = (i7 & 8) != 0 ? true : z6;
        str3 = (i7 & 16) != 0 ? "" : str3;
        this.f88985a = j7;
        this.f88986b = str;
        this.f88987c = str2;
        this.f88988d = z6;
        this.f88989e = str3;
    }

    @NotNull
    public final String a() {
        return this.f88986b;
    }

    public final boolean b() {
        return this.f88988d;
    }

    public final long c() {
        return this.f88985a;
    }

    @NotNull
    public final String d() {
        return this.f88989e;
    }

    @NotNull
    public final String e() {
        return this.f88987c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheeseActivityProgress)) {
            return false;
        }
        CheeseActivityProgress cheeseActivityProgress = (CheeseActivityProgress) obj;
        return this.f88985a == cheeseActivityProgress.f88985a && Intrinsics.areEqual(this.f88986b, cheeseActivityProgress.f88986b) && Intrinsics.areEqual(this.f88987c, cheeseActivityProgress.f88987c) && this.f88988d == cheeseActivityProgress.f88988d && Intrinsics.areEqual(this.f88989e, cheeseActivityProgress.f88989e);
    }

    public final int hashCode() {
        return this.f88989e.hashCode() + z.a(E.a(E.a(Long.hashCode(this.f88985a) * 31, 31, this.f88986b), 31, this.f88987c), 31, this.f88988d);
    }

    @NotNull
    public final String toString() {
        long j7 = this.f88985a;
        String str = this.f88986b;
        String str2 = this.f88987c;
        boolean z6 = this.f88988d;
        String str3 = this.f88989e;
        StringBuilder sbA = n.a(j7, "CheeseActivityProgress(completeQueryInterval=", ", completeActivityMsg=", str);
        cf.n.a(", viewProgressMsg=", str2, ", completeNotified=", sbA, z6);
        return D.a(", startActivityMsg=", str3, ")", sbA);
    }
}
