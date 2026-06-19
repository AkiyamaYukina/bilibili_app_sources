package com.bilibili.search2.result.base;

import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/l.class */
@StabilityInferred(parameters = 0)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.search2.result.holder.recommend.p f87555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f87556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.search2.result.holder.recommend.c f87557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f87558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f87559f;

    public l() {
        throw null;
    }

    public l(int i7, com.bilibili.search2.result.holder.recommend.p pVar, com.bilibili.search2.result.holder.recommend.c cVar, boolean z6) {
        this.f87554a = i7;
        this.f87555b = pVar;
        this.f87556c = true;
        this.f87557d = cVar;
        this.f87558e = z6;
        this.f87559f = true;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f87554a == lVar.f87554a && Intrinsics.areEqual(this.f87555b, lVar.f87555b) && this.f87556c == lVar.f87556c && Intrinsics.areEqual(this.f87557d, lVar.f87557d) && this.f87558e == lVar.f87558e && this.f87559f == lVar.f87559f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87559f) + z.a((this.f87557d.hashCode() + z.a((this.f87555b.hashCode() + (Integer.hashCode(this.f87554a) * 31)) * 31, 31, this.f87556c)) * 31, 31, this.f87558e);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("InsertOrReplaceParams(position=");
        sb.append(this.f87554a);
        sb.append(", item=");
        sb.append(this.f87555b);
        sb.append(", replace=");
        sb.append(this.f87556c);
        sb.append(", replaceOffset=");
        sb.append(this.f87557d);
        sb.append(", discardCard=");
        sb.append(this.f87558e);
        sb.append(", replaceSameGoto=");
        return androidx.appcompat.app.i.a(sb, this.f87559f, ")");
    }
}
