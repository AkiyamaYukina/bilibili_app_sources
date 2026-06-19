package com.bilibili.ogv.misc.follow.api.entity;

import X1.F;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import androidx.media3.exoplayer.analytics.C4668j;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/BangumiMineFollowV2.class */
@StabilityInferred(parameters = 0)
@Bson
public final class BangumiMineFollowV2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("has_next")
    private boolean f69116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("vip_tip")
    @NotNull
    private List<BangumiMineFollowNotice> f69117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("watched")
    @NotNull
    private List<ItemData> f69118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("series")
    @NotNull
    private List<SeriesItem> f69119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("want")
    @NotNull
    private List<ItemData> f69120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("follow_list")
    @NotNull
    private List<ItemData> f69121f;

    public BangumiMineFollowV2() {
        this(false, null, null, null, null, null, 63);
    }

    public BangumiMineFollowV2(boolean z6, List list, List list2, List list3, List list4, List list5, int i7) {
        z6 = (i7 & 1) != 0 ? true : z6;
        list = (i7 & 2) != 0 ? new ArrayList() : list;
        list2 = (i7 & 4) != 0 ? new ArrayList() : list2;
        list3 = (i7 & 8) != 0 ? new ArrayList() : list3;
        list4 = (i7 & 16) != 0 ? new ArrayList() : list4;
        list5 = (i7 & 32) != 0 ? new ArrayList() : list5;
        this.f69116a = z6;
        this.f69117b = list;
        this.f69118c = list2;
        this.f69119d = list3;
        this.f69120e = list4;
        this.f69121f = list5;
    }

    @NotNull
    public final List<ItemData> a() {
        return this.f69121f;
    }

    public final boolean b() {
        return this.f69116a;
    }

    @NotNull
    public final List<SeriesItem> c() {
        return this.f69119d;
    }

    @NotNull
    public final List<BangumiMineFollowNotice> d() {
        return this.f69117b;
    }

    @NotNull
    public final List<ItemData> e() {
        return this.f69120e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BangumiMineFollowV2)) {
            return false;
        }
        BangumiMineFollowV2 bangumiMineFollowV2 = (BangumiMineFollowV2) obj;
        return this.f69116a == bangumiMineFollowV2.f69116a && Intrinsics.areEqual(this.f69117b, bangumiMineFollowV2.f69117b) && Intrinsics.areEqual(this.f69118c, bangumiMineFollowV2.f69118c) && Intrinsics.areEqual(this.f69119d, bangumiMineFollowV2.f69119d) && Intrinsics.areEqual(this.f69120e, bangumiMineFollowV2.f69120e) && Intrinsics.areEqual(this.f69121f, bangumiMineFollowV2.f69121f);
    }

    @NotNull
    public final List<ItemData> f() {
        return this.f69118c;
    }

    public final int hashCode() {
        return this.f69121f.hashCode() + e0.a(e0.a(e0.a(e0.a(Boolean.hashCode(this.f69116a) * 31, 31, this.f69117b), 31, this.f69118c), 31, this.f69119d), 31, this.f69120e);
    }

    @NotNull
    public final String toString() {
        boolean z6 = this.f69116a;
        List<BangumiMineFollowNotice> list = this.f69117b;
        List<ItemData> list2 = this.f69118c;
        List<SeriesItem> list3 = this.f69119d;
        List<ItemData> list4 = this.f69120e;
        List<ItemData> list5 = this.f69121f;
        StringBuilder sb = new StringBuilder("BangumiMineFollowV2(hasNext=");
        sb.append(z6);
        sb.append(", vipTip=");
        sb.append(list);
        sb.append(", watchList=");
        F.c(", series=", ", want=", sb, list2, list3);
        return C4668j.a(", followList=", ")", sb, list4, list5);
    }
}
