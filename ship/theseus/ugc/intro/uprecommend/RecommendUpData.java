package com.bilibili.ship.theseus.ugc.intro.uprecommend;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import c6.N;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpData.class */
@StabilityInferred(parameters = 0)
@Bson
public final class RecommendUpData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("param")
    @NotNull
    private final String f97782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("title")
    @NotNull
    private final String f97783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("items")
    @NotNull
    private final List<RecommendUp> f97784c;

    public RecommendUpData() {
        throw null;
    }

    public RecommendUpData(int i7, String str, List list, String str2) {
        list = (i7 & 4) != 0 ? CollectionsKt.emptyList() : list;
        this.f97782a = str;
        this.f97783b = str2;
        this.f97784c = list;
    }

    @NotNull
    public final List<RecommendUp> a() {
        return this.f97784c;
    }

    @NotNull
    public final String b() {
        return this.f97782a;
    }

    @NotNull
    public final String c() {
        return this.f97783b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendUpData)) {
            return false;
        }
        RecommendUpData recommendUpData = (RecommendUpData) obj;
        return Intrinsics.areEqual(this.f97782a, recommendUpData.f97782a) && Intrinsics.areEqual(this.f97783b, recommendUpData.f97783b) && Intrinsics.areEqual(this.f97784c, recommendUpData.f97784c);
    }

    public final int hashCode() {
        return this.f97784c.hashCode() + E.a(this.f97782a.hashCode() * 31, 31, this.f97783b);
    }

    @NotNull
    public final String toString() {
        String str = this.f97782a;
        String str2 = this.f97783b;
        return N.a(G0.b.a("RecommendUpData(param=", str, ", title=", str2, ", items="), ")", this.f97784c);
    }
}
