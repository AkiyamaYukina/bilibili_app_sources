package com.bilibili.ship.theseus.ogv.intro.floatlayer.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/bean/Rating.class */
@StabilityInferred(parameters = 1)
@Bson
public final class Rating {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f92897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f92898b;

    public Rating(float f7, @NotNull String str) {
        this.f92897a = f7;
        this.f92898b = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rating)) {
            return false;
        }
        Rating rating = (Rating) obj;
        return Float.compare(this.f92897a, rating.f92897a) == 0 && Intrinsics.areEqual(this.f92898b, rating.f92898b);
    }

    public final int hashCode() {
        return this.f92898b.hashCode() + (Float.hashCode(this.f92897a) * 31);
    }

    @NotNull
    public final String toString() {
        return "Rating(score=" + this.f92897a + ", count=" + this.f92898b + ")";
    }
}
