package com.bilibili.playset.api;

import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playset.playlist.adapters.FavFooterItem$Companion$LoadMoreType;
import com.bilibili.search2.api.SearchBangumiItem;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("total")
    private final int f84066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("has_more")
    private final boolean f84067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("list")
    @Nullable
    private final List<c> f84068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("next_oid")
    private final long f84069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("next_otype")
    private final int f84070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("has_invalid")
    private final boolean f84071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public FavFooterItem$Companion$LoadMoreType f84072g;

    public d() {
        this(0, false, null, 0L, 0, SearchBangumiItem.TYPE_FULLNET_BANGUMI);
    }

    public /* synthetic */ d(int i7, boolean z6, List list, long j7, int i8, int i9) {
        this((i9 & 1) != 0 ? 0 : i7, (i9 & 2) != 0 ? false : z6, (i9 & 4) != 0 ? CollectionsKt.emptyList() : list, (i9 & 8) != 0 ? 0L : j7, (i9 & 16) != 0 ? 0 : i8, false, FavFooterItem$Companion$LoadMoreType.LOAD_MORE_STATUS_GONE);
    }

    public d(int i7, boolean z6, @Nullable List<c> list, long j7, int i8, boolean z7, @NotNull FavFooterItem$Companion$LoadMoreType favFooterItem$Companion$LoadMoreType) {
        this.f84066a = i7;
        this.f84067b = z6;
        this.f84068c = list;
        this.f84069d = j7;
        this.f84070e = i8;
        this.f84071f = z7;
        this.f84072g = favFooterItem$Companion$LoadMoreType;
    }

    public static d a(d dVar, List list) {
        return new d(dVar.f84066a, dVar.f84067b, list, dVar.f84069d, dVar.f84070e, dVar.f84071f, dVar.f84072g);
    }

    public final boolean b() {
        return this.f84071f;
    }

    public final boolean c() {
        return this.f84067b;
    }

    @Nullable
    public final List<c> d() {
        return this.f84068c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f84066a == dVar.f84066a && this.f84067b == dVar.f84067b && Intrinsics.areEqual(this.f84068c, dVar.f84068c) && this.f84069d == dVar.f84069d && this.f84070e == dVar.f84070e && this.f84071f == dVar.f84071f && this.f84072g == dVar.f84072g;
    }

    public final int hashCode() {
        int iA = z.a(Integer.hashCode(this.f84066a) * 31, 31, this.f84067b);
        List<c> list = this.f84068c;
        return this.f84072g.hashCode() + z.a(I.a(this.f84070e, C3554n0.a((iA + (list == null ? 0 : list.hashCode())) * 31, 31, this.f84069d), 31), 31, this.f84071f);
    }

    @NotNull
    public final String toString() {
        int i7 = this.f84066a;
        boolean z6 = this.f84067b;
        List<c> list = this.f84068c;
        long j7 = this.f84069d;
        int i8 = this.f84070e;
        boolean z7 = this.f84071f;
        FavFooterItem$Companion$LoadMoreType favFooterItem$Companion$LoadMoreType = this.f84072g;
        StringBuilder sbA = z4.c.a(i7, "FavoritesTabList(total=", ", hasMore=", ", list=", z6);
        sbA.append(list);
        sbA.append(", nextOid=");
        sbA.append(j7);
        cf.m.a(", nextOType=", ", hasInvalid=", i8, z7, sbA);
        sbA.append(", footerState=");
        sbA.append(favFooterItem$Companion$LoadMoreType);
        sbA.append(")");
        return sbA.toString();
    }
}
