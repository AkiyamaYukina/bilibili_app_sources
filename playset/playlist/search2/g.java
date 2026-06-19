package com.bilibili.playset.playlist.search2;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/g.class */
@StabilityInferred(parameters = 1)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f85444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Long f85445b;

    public g(@Nullable String str, @Nullable Long l7) {
        this.f85444a = str;
        this.f85445b = l7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f85444a, gVar.f85444a) && Intrinsics.areEqual(this.f85445b, gVar.f85445b);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f85444a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Long l7 = this.f85445b;
        if (l7 != null) {
            iHashCode = l7.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "CollectionSearchResultParam(keyword=" + this.f85444a + ", playlistId=" + this.f85445b + ")";
    }
}
