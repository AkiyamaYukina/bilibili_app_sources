package com.bilibili.ship.theseus.playlist.api;

import K7.M;
import androidx.compose.animation.z;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/ListResponse.class */
@StabilityInferred(parameters = 0)
@Bson
public final class ListResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<MultiTypeMedia> f95206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f95207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f95208c;

    public ListResponse() {
        this(null, 0, 7, false);
    }

    public ListResponse(List list, int i7, int i8, boolean z6) {
        list = (i8 & 1) != 0 ? CollectionsKt.emptyList() : list;
        z6 = (i8 & 2) != 0 ? false : z6;
        i7 = (i8 & 4) != 0 ? 0 : i7;
        this.f95206a = list;
        this.f95207b = z6;
        this.f95208c = i7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListResponse)) {
            return false;
        }
        ListResponse listResponse = (ListResponse) obj;
        return Intrinsics.areEqual(this.f95206a, listResponse.f95206a) && this.f95207b == listResponse.f95207b && this.f95208c == listResponse.f95208c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f95208c) + z.a(this.f95206a.hashCode() * 31, 31, this.f95207b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbA = M.a("ListResponse(mediaList=", ", hasMore=", this.f95206a);
        sbA.append(this.f95207b);
        sbA.append(", totalCount=");
        return C4277b.a(this.f95208c, ")", sbA);
    }
}
