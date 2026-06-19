package com.bilibili.search2.discover;

import K7.M;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.api.SearchRank;
import com.bilibili.search2.api.SearchRankingMeta;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/l.class */
@StabilityInferred(parameters = 0)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final List<SearchRank> f86447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f86448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final SearchRankingMeta f86449c;

    public l(@Nullable List<SearchRank> list, @Nullable String str, @Nullable SearchRankingMeta searchRankingMeta) {
        this.f86447a = list;
        this.f86448b = str;
        this.f86449c = searchRankingMeta;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.areEqual(this.f86447a, lVar.f86447a) && Intrinsics.areEqual(this.f86448b, lVar.f86448b) && Intrinsics.areEqual(this.f86449c, lVar.f86449c);
    }

    public final int hashCode() {
        List<SearchRank> list = this.f86447a;
        int iHashCode = 0;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str = this.f86448b;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        SearchRankingMeta searchRankingMeta = this.f86449c;
        if (searchRankingMeta != null) {
            iHashCode = searchRankingMeta.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbA = M.a("RankModel(list=", ", title=", this.f86447a);
        sbA.append(this.f86448b);
        sbA.append(", rankingMeta=");
        sbA.append(this.f86449c);
        sbA.append(")");
        return sbA.toString();
    }
}
