package com.bilibili.search2.main.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.api.SearchSquareType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/data/i.class */
@StabilityInferred(parameters = 0)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final List<SearchSquareType> f86820a;

    public i() {
        this(null);
    }

    public i(@Nullable List<SearchSquareType> list) {
        this.f86820a = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.areEqual(this.f86820a, ((i) obj).f86820a);
    }

    public final int hashCode() {
        List<SearchSquareType> list = this.f86820a;
        return list == null ? 0 : list.hashCode();
    }

    @NotNull
    public final String toString() {
        return com.bapis.bilibili.account.interfaces.v1.k.a("SearchResultSquareState(searchSquareLists=", ")", this.f86820a);
    }
}
