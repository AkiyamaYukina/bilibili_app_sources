package com.bilibili.search2.main.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/data/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("query")
    @NotNull
    private final c f86800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("show_seq")
    @Nullable
    private final List<j> f86801b;

    public b(@NotNull c cVar, @Nullable List<j> list) {
        this.f86800a = cVar;
        this.f86801b = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f86800a, bVar.f86800a) && Intrinsics.areEqual(this.f86801b, bVar.f86801b);
    }

    public final int hashCode() {
        int iHashCode = this.f86800a.hashCode();
        List<j> list = this.f86801b;
        return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ActSeqItem(query=" + this.f86800a + ", showSeq=" + this.f86801b + ")";
    }
}
