package com.bilibili.search2.result.ogv.aggregate;

import K7.L;
import K7.M;
import Ps0.C2786g;
import Ps0.C2791l;
import Ps0.C2792m;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import com.bilibili.search2.api.SearchOgvRelationItem;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/v.class */
@StabilityInferred(parameters = 0)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public List<C2786g> f88430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f88431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<C2791l> f88432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public List<SearchOgvRelationItem.DetailsRelationItem> f88433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final C2792m f88434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f88435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f88436g;

    public v() {
        this(null);
    }

    public v(Object obj) {
        List<C2786g> listEmptyList = CollectionsKt.emptyList();
        List<C2791l> listEmptyList2 = CollectionsKt.emptyList();
        List<SearchOgvRelationItem.DetailsRelationItem> listEmptyList3 = CollectionsKt.emptyList();
        Map<String, String> mapEmptyMap = MapsKt.emptyMap();
        this.f88430a = listEmptyList;
        this.f88431b = false;
        this.f88432c = listEmptyList2;
        this.f88433d = listEmptyList3;
        this.f88434e = null;
        this.f88435f = 0L;
        this.f88436g = mapEmptyMap;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.areEqual(this.f88430a, vVar.f88430a) && this.f88431b == vVar.f88431b && Intrinsics.areEqual(this.f88432c, vVar.f88432c) && Intrinsics.areEqual(this.f88433d, vVar.f88433d) && Intrinsics.areEqual(this.f88434e, vVar.f88434e) && this.f88435f == vVar.f88435f && Intrinsics.areEqual(this.f88436g, vVar.f88436g);
    }

    public final int hashCode() {
        int iA = e0.a(e0.a(z.a(this.f88430a.hashCode() * 31, 31, this.f88431b), 31, this.f88432c), 31, this.f88433d);
        C2792m c2792m = this.f88434e;
        return this.f88436g.hashCode() + C3554n0.a((iA + (c2792m == null ? 0 : c2792m.hashCode())) * 31, 31, this.f88435f);
    }

    @NotNull
    public final String toString() {
        List<C2786g> list = this.f88430a;
        List<C2791l> list2 = this.f88432c;
        List<SearchOgvRelationItem.DetailsRelationItem> list3 = this.f88433d;
        Map<String, String> map = this.f88436g;
        StringBuilder sbA = M.a("SearchOGVReply(extraWordList=", ", needOrder=", list);
        L.b(sbA, this.f88431b, ", items=", list2, ", relationItems=");
        sbA.append(list3);
        sbA.append(", pagination=");
        sbA.append(this.f88434e);
        sbA.append(", page=");
        f6.a.a(sbA, this.f88435f, ", annotation=", map);
        sbA.append(")");
        return sbA.toString();
    }
}
