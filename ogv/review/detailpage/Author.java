package com.bilibili.ogv.review.detailpage;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/Author.class */
@StabilityInferred(parameters = 1)
@Bson
public final class Author {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f72224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f72225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f72226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Vip f72227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f72228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final VipLabel f72229f;

    public Author(long j7, @NotNull String str, @NotNull String str2, @Nullable Vip vip, int i7, @Nullable VipLabel vipLabel) {
        this.f72224a = j7;
        this.f72225b = str;
        this.f72226c = str2;
        this.f72227d = vip;
        this.f72228e = i7;
        this.f72229f = vipLabel;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Author)) {
            return false;
        }
        Author author = (Author) obj;
        return this.f72224a == author.f72224a && Intrinsics.areEqual(this.f72225b, author.f72225b) && Intrinsics.areEqual(this.f72226c, author.f72226c) && Intrinsics.areEqual(this.f72227d, author.f72227d) && this.f72228e == author.f72228e && Intrinsics.areEqual(this.f72229f, author.f72229f);
    }

    public final int hashCode() {
        int iA = E.a(E.a(Long.hashCode(this.f72224a) * 31, 31, this.f72225b), 31, this.f72226c);
        Vip vip = this.f72227d;
        int iA2 = I.a(this.f72228e, (iA + (vip == null ? 0 : vip.hashCode())) * 31, 31);
        VipLabel vipLabel = this.f72229f;
        return iA2 + (vipLabel == null ? 0 : vipLabel.hashCode());
    }

    @NotNull
    public final String toString() {
        return "Author(mid=" + this.f72224a + ", uname=" + this.f72225b + ", avatar=" + this.f72226c + ", vip=" + this.f72227d + ", level=" + this.f72228e + ", vipLabel=" + this.f72229f + ")";
    }
}
