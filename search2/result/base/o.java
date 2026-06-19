package com.bilibili.search2.result.base;

import android.net.Uri;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.api.SearchVideoItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/o.class */
@StabilityInferred(parameters = 0)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Uri f87567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SearchVideoItem f87569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f87570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.search2.result.holder.recommend.b f87571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.search2.result.holder.recommend.c f87572f;

    public o(@NotNull Uri uri, int i7, @NotNull SearchVideoItem searchVideoItem, long j7, @NotNull com.bilibili.search2.result.holder.recommend.b bVar, @NotNull com.bilibili.search2.result.holder.recommend.c cVar) {
        this.f87567a = uri;
        this.f87568b = i7;
        this.f87569c = searchVideoItem;
        this.f87570d = j7;
        this.f87571e = bVar;
        this.f87572f = cVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f87567a, oVar.f87567a) && this.f87568b == oVar.f87568b && Intrinsics.areEqual(this.f87569c, oVar.f87569c) && this.f87570d == oVar.f87570d && Intrinsics.areEqual(this.f87571e, oVar.f87571e) && Intrinsics.areEqual(this.f87572f, oVar.f87572f);
    }

    public final int hashCode() {
        int iA = z.a(C3554n0.a((this.f87569c.hashCode() + I.a(this.f87568b, this.f87567a.hashCode() * 31, 31)) * 31, 31, this.f87570d), 31, true);
        return this.f87572f.hashCode() + ((this.f87571e.hashCode() + iA) * 31);
    }

    @NotNull
    public final String toString() {
        return "RecAfterClickParams(uri=" + this.f87567a + ", position=" + this.f87568b + ", data=" + this.f87569c + ", insertMinTime=" + this.f87570d + ", replace=true, discardCard=" + this.f87571e + ", replaceOffset=" + this.f87572f + ")";
    }
}
