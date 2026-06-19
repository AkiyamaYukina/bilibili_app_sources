package com.bilibili.search2.result.holder.recommend;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.api.BaseSearchItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/recommend/p.class */
@StabilityInferred(parameters = 0)
public final class p extends BaseSearchItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public List<d> f88200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f88201b;

    public p() {
        this(null);
    }

    public p(Object obj) {
        this.f88200a = null;
        this.f88201b = 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.areEqual(this.f88200a, pVar.f88200a) && this.f88201b == pVar.f88201b;
    }

    public final int hashCode() {
        List<d> list = this.f88200a;
        return Integer.hashCode(this.f88201b) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "SearchRelatedSearchItem(wordList=" + this.f88200a + ", cardHeight=" + this.f88201b + ")";
    }
}
