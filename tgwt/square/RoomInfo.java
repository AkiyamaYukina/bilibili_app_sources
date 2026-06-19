package com.bilibili.tgwt.square;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/RoomInfo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class RoomInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final List<RecentWatcher> f112090a;

    public RoomInfo(@Nullable List<RecentWatcher> list) {
        this.f112090a = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RoomInfo) && Intrinsics.areEqual(this.f112090a, ((RoomInfo) obj).f112090a);
    }

    public final int hashCode() {
        List<RecentWatcher> list = this.f112090a;
        return list == null ? 0 : list.hashCode();
    }

    @NotNull
    public final String toString() {
        return com.bapis.bilibili.account.interfaces.v1.k.a("RoomInfo(recentWatchers=", ")", this.f112090a);
    }
}
