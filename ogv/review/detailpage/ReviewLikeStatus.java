package com.bilibili.ogv.review.detailpage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/ReviewLikeStatus.class */
@StabilityInferred(parameters = 0)
@Bson
public final class ReviewLikeStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f72304a;

    public ReviewLikeStatus() {
        this(null, 1);
    }

    public ReviewLikeStatus(String str, int i7) {
        this.f72304a = (i7 & 1) != 0 ? null : str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReviewLikeStatus) && Intrinsics.areEqual(this.f72304a, ((ReviewLikeStatus) obj).f72304a);
    }

    public final int hashCode() {
        String str = this.f72304a;
        return str == null ? 0 : str.hashCode();
    }

    @NotNull
    public final String toString() {
        return C8770a.a(new StringBuilder("ReviewLikeStatus(status="), this.f72304a, ")");
    }
}
