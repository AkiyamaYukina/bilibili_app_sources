package com.bilibili.ship.theseus.cheese.biz.intro.desc;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/j.class */
@StabilityInferred(parameters = 1)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f89417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f89418b;

    public j(@NotNull String str, double d7) {
        this.f89417a = str;
        this.f89418b = d7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f89417a, jVar.f89417a) && Double.compare(this.f89418b, jVar.f89418b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f89418b) + (this.f89417a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PugvSeasonDescriptionImageItem(imageUrl=");
        sb.append(this.f89417a);
        sb.append(", aspectRatio=");
        return z4.b.a(sb, this.f89418b, ")");
    }
}
