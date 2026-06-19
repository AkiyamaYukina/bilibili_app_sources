package com.bilibili.search2.result.ogv.aggregate;

import I.E;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.api.SearchOgvClusterRelationItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SearchOgvClusterRelationItem.Sort f88315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f88316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f88317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f88318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f88319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final t f88320g;

    @Nullable
    public final com.bilibili.search2.api.g h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f88321i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f88322j;

    public a() {
        throw null;
    }

    public a(int i7, SearchOgvClusterRelationItem.Sort sort, String str, String str2, String str3, t tVar, com.bilibili.search2.api.g gVar, boolean z6) {
        this.f88314a = i7;
        this.f88315b = sort;
        this.f88316c = str;
        this.f88317d = str2;
        this.f88318e = str3;
        this.f88319f = "ogv_cluster_card_search";
        this.f88320g = tVar;
        this.h = gVar;
        this.f88321i = false;
        this.f88322j = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f88314a == aVar.f88314a && this.f88315b == aVar.f88315b && Intrinsics.areEqual(this.f88316c, aVar.f88316c) && Intrinsics.areEqual(this.f88317d, aVar.f88317d) && Intrinsics.areEqual(this.f88318e, aVar.f88318e) && Intrinsics.areEqual(this.f88319f, aVar.f88319f) && Intrinsics.areEqual(this.f88320g, aVar.f88320g) && Intrinsics.areEqual(this.h, aVar.h) && this.f88321i == aVar.f88321i && this.f88322j == aVar.f88322j;
    }

    public final int hashCode() {
        int iA = E.a(E.a((this.f88315b.hashCode() + (Integer.hashCode(this.f88314a) * 31)) * 31, 31, this.f88316c), 31, this.f88317d);
        String str = this.f88318e;
        int iA2 = E.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.f88319f);
        int iHashCode = this.f88320g.hashCode();
        com.bilibili.search2.api.g gVar = this.h;
        return Boolean.hashCode(this.f88322j) + z.a((((iHashCode + iA2) * 31) + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.f88321i);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("OGVAggregateParams(position=");
        sb.append(this.f88314a);
        sb.append(", order=");
        sb.append(this.f88315b);
        sb.append(", firstExtraWord=");
        sb.append(this.f88316c);
        sb.append(", secondExtraWord=");
        sb.append(this.f88317d);
        sb.append(", keyword=");
        sb.append(this.f88318e);
        sb.append(", fromSource=");
        sb.append(this.f88319f);
        sb.append(", replaceOffset=");
        sb.append(this.f88320g);
        sb.append(", item=");
        sb.append(this.h);
        sb.append(", needOgvExtraWord=");
        sb.append(this.f88321i);
        sb.append(", forceRetry=");
        return androidx.appcompat.app.i.a(sb, this.f88322j, ")");
    }
}
