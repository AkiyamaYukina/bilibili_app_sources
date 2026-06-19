package com.bilibili.ship.theseus.ogv.intro.limitedtimefree;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/limitedtimefree/LimitedTimeFreeImages.class */
@StabilityInferred(parameters = 0)
@Bson
public final class LimitedTimeFreeImages {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f93226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("url")
    @NotNull
    private final List<String> f93227b;

    public LimitedTimeFreeImages() {
        throw null;
    }

    public LimitedTimeFreeImages(int i7, String str, List list) {
        list = (i7 & 2) != 0 ? CollectionsKt.emptyList() : list;
        this.f93226a = str;
        this.f93227b = list;
    }

    @NotNull
    public final List<String> a() {
        return this.f93227b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitedTimeFreeImages)) {
            return false;
        }
        LimitedTimeFreeImages limitedTimeFreeImages = (LimitedTimeFreeImages) obj;
        return Intrinsics.areEqual(this.f93226a, limitedTimeFreeImages.f93226a) && Intrinsics.areEqual(this.f93227b, limitedTimeFreeImages.f93227b);
    }

    public final int hashCode() {
        return this.f93227b.hashCode() + (this.f93226a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        List<String> list = this.f93227b;
        return N1.o.a(this.f93226a, ", urls=", ")", new StringBuilder("LimitedTimeFreeImages(code="), list);
    }
}
