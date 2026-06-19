package com.bilibili.search2.main.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/data/a.class */
@StabilityInferred(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final c f86798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final j f86799b;

    public a(@NotNull c cVar, @Nullable j jVar) {
        this.f86798a = cVar;
        this.f86799b = jVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f86798a, aVar.f86798a) && Intrinsics.areEqual(this.f86799b, aVar.f86799b);
    }

    public final int hashCode() {
        int iHashCode = this.f86798a.hashCode();
        j jVar = this.f86799b;
        return (iHashCode * 31) + (jVar == null ? 0 : jVar.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ActItem(query=" + this.f86798a + ", showSeqItem=" + this.f86799b + ")";
    }
}
