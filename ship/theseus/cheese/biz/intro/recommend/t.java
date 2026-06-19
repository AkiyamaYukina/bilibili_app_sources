package com.bilibili.ship.theseus.cheese.biz.intro.recommend;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import eu0.C7004w;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/t.class */
@StabilityInferred(parameters = 0)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C7004w f89998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<u> f89999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final v f90000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final RecommendUIStyle f90001d;

    public t(@NotNull C7004w c7004w, @NotNull List<u> list, @NotNull v vVar, @NotNull RecommendUIStyle recommendUIStyle) {
        this.f89998a = c7004w;
        this.f89999b = list;
        this.f90000c = vVar;
        this.f90001d = recommendUIStyle;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.areEqual(this.f89998a, tVar.f89998a) && Intrinsics.areEqual(this.f89999b, tVar.f89999b) && Intrinsics.areEqual(this.f90000c, tVar.f90000c) && this.f90001d == tVar.f90001d;
    }

    public final int hashCode() {
        int iA = e0.a(this.f89998a.hashCode() * 31, 31, this.f89999b);
        return this.f90001d.hashCode() + ((this.f90000c.hashCode() + iA) * 31);
    }

    @NotNull
    public final String toString() {
        return "PugvSeasonRecommend(nav=" + this.f89998a + ", contents=" + this.f89999b + ", moreInfo=" + this.f90000c + ", showStyle=" + this.f90001d + ")";
    }
}
