package com.bilibili.ogv.review.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/data/ReviewTag.class */
@StabilityInferred(parameters = 1)
@Bson
public final class ReviewTag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f72221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ReviewType f72222b;

    public ReviewTag(String str, ReviewType reviewType, int i7) {
        reviewType = (i7 & 2) != 0 ? ReviewType.ALL : reviewType;
        this.f72221a = str;
        this.f72222b = reviewType;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewTag)) {
            return false;
        }
        ReviewTag reviewTag = (ReviewTag) obj;
        return Intrinsics.areEqual(this.f72221a, reviewTag.f72221a) && this.f72222b == reviewTag.f72222b;
    }

    public final int hashCode() {
        return this.f72222b.hashCode() + (this.f72221a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ReviewTag(title=" + this.f72221a + ", type=" + this.f72222b + ")";
    }
}
