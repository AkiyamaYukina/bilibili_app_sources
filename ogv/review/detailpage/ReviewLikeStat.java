package com.bilibili.ogv.review.detailpage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/ReviewLikeStat.class */
@StabilityInferred(parameters = 1)
@Bson
public final class ReviewLikeStat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f72301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f72302b;

    public ReviewLikeStat(long j7, boolean z6) {
        this.f72301a = j7;
        this.f72302b = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewLikeStat)) {
            return false;
        }
        ReviewLikeStat reviewLikeStat = (ReviewLikeStat) obj;
        return this.f72301a == reviewLikeStat.f72301a && this.f72302b == reviewLikeStat.f72302b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f72302b) + (Long.hashCode(this.f72301a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewLikeStat(likes=");
        sb.append(this.f72301a);
        sb.append(", liked=");
        return androidx.appcompat.app.i.a(sb, this.f72302b, ")");
    }
}
