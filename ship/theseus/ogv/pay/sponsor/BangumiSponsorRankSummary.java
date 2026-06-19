package com.bilibili.ship.theseus.ogv.pay.sponsor;

import Vn.A;
import X1.F;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import c6.N;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogv.pub.sponsor.BangumiPendant;
import com.bilibili.ogv.pub.sponsor.BangumiSponsorEvent;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/sponsor/BangumiSponsorRankSummary.class */
@StabilityInferred(parameters = 0)
@Bson
public final class BangumiSponsorRankSummary {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("week")
    private final int f94208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("total")
    private final int f94209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("point_activity")
    @NotNull
    private final BangumiSponsorEvent f94210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("mine")
    @NotNull
    private final BangumiSponsorMineRank f94211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("rank_list")
    @NotNull
    private final List<BangumiSponsorRankUser> f94212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<BangumiPendant> f94213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("threshold")
    @NotNull
    private final List<BangumiThreshold> f94214g;

    public BangumiSponsorRankSummary() {
        throw null;
    }

    public BangumiSponsorRankSummary(int i7, int i8, BangumiSponsorEvent bangumiSponsorEvent, BangumiSponsorMineRank bangumiSponsorMineRank, List list, List list2, List list3, int i9) {
        i7 = (i9 & 1) != 0 ? 0 : i7;
        i8 = (i9 & 2) != 0 ? 0 : i8;
        this.f94208a = i7;
        this.f94209b = i8;
        this.f94210c = bangumiSponsorEvent;
        this.f94211d = bangumiSponsorMineRank;
        this.f94212e = list;
        this.f94213f = list2;
        this.f94214g = list3;
    }

    @NotNull
    public final List<BangumiSponsorRankUser> a() {
        return this.f94212e;
    }

    @NotNull
    public final BangumiSponsorMineRank b() {
        return this.f94211d;
    }

    @NotNull
    public final BangumiSponsorEvent c() {
        return this.f94210c;
    }

    @NotNull
    public final List<BangumiThreshold> d() {
        return this.f94214g;
    }

    public final int e() {
        return this.f94209b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BangumiSponsorRankSummary)) {
            return false;
        }
        BangumiSponsorRankSummary bangumiSponsorRankSummary = (BangumiSponsorRankSummary) obj;
        return this.f94208a == bangumiSponsorRankSummary.f94208a && this.f94209b == bangumiSponsorRankSummary.f94209b && Intrinsics.areEqual(this.f94210c, bangumiSponsorRankSummary.f94210c) && Intrinsics.areEqual(this.f94211d, bangumiSponsorRankSummary.f94211d) && Intrinsics.areEqual(this.f94212e, bangumiSponsorRankSummary.f94212e) && Intrinsics.areEqual(this.f94213f, bangumiSponsorRankSummary.f94213f) && Intrinsics.areEqual(this.f94214g, bangumiSponsorRankSummary.f94214g);
    }

    public final int f() {
        return this.f94208a;
    }

    public final int hashCode() {
        int iA = I.a(this.f94209b, Integer.hashCode(this.f94208a) * 31, 31);
        return this.f94214g.hashCode() + e0.a(e0.a((this.f94211d.hashCode() + ((this.f94210c.hashCode() + iA) * 31)) * 31, 31, this.f94212e), 31, this.f94213f);
    }

    @NotNull
    public final String toString() {
        int i7 = this.f94208a;
        int i8 = this.f94209b;
        BangumiSponsorEvent bangumiSponsorEvent = this.f94210c;
        BangumiSponsorMineRank bangumiSponsorMineRank = this.f94211d;
        List<BangumiSponsorRankUser> list = this.f94212e;
        List<BangumiPendant> list2 = this.f94213f;
        List<BangumiThreshold> list3 = this.f94214g;
        StringBuilder sbB = A.b(i7, i8, "BangumiSponsorRankSummary(weekPayUsers=", ", totalPayUsers=", ", sponsorActivity=");
        sbB.append(bangumiSponsorEvent);
        sbB.append(", myRank=");
        sbB.append(bangumiSponsorMineRank);
        sbB.append(", list=");
        F.c(", pendants=", ", thresholds=", sbB, list, list2);
        return N.a(sbB, ")", list3);
    }
}
